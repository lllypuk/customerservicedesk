package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Пользователь для обслуживания
 */
@Document
@Getter
@Setter
public class Customer extends AbstractDocument {

    private String firstName;
    private String lastName;
    private String phoneNumber;

    @Field("email")
    @Indexed(unique = true)
    private EmailAddress emailAddress;
    private Set<Address> addresses = new HashSet<>();

    private Company company;

    public void add(Address address) {
        Assert.notNull(address, "Адрес не может быть пустым!");
        this.addresses.add(address);
    }

    public Set<Address> getAddresses() {
        return Collections.unmodifiableSet(addresses);
    }
}
