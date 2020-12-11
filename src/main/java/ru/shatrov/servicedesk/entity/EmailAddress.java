package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.io.Serializable;
import java.util.regex.Pattern;

/**
 * Created on 11.12.2020.
 *
 * @author Shatrov Aleksandr
 */
@Getter
@Setter
public class EmailAddress implements Serializable {

    private static final String EMAIL_REGEX = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final Pattern PATTERN = Pattern.compile(EMAIL_REGEX);

    @Field("email")
    private final String value;

    public EmailAddress(String emailAddress) {
        Assert.isTrue(isValid(emailAddress), "Invalid email address!");
        this.value = emailAddress;
    }

    public static boolean isValid(String candidate) {
        return candidate != null && PATTERN.matcher(candidate).matches();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmailAddress)) {
            return false;
        }

        EmailAddress that = (EmailAddress) obj;
        return this.value.equals(that.value);
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Component
    static class EmailAddressToStringConverter implements Converter<EmailAddress, String> {

        @Override
        public String convert(EmailAddress source) {
            return source.value;
        }
    }

    @Component
    static class StringToEmailAddressConverter implements Converter<String, EmailAddress> {

        public EmailAddress convert(String source) {
            return StringUtils.hasText(source) ? new EmailAddress(source) : null;
        }
    }
}
