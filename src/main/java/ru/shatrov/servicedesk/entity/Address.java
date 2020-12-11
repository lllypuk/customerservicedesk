package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.Assert;

/**
 * Адрес пользователя
 */
@Getter
@Setter
public class Address {

    private final String houseNumber;
    private final String street;
    private final String city;

    public Address(String houseNumber, String street, String city) {

        Assert.hasText(houseNumber, "Номер дома должен быть заполнен!");
        Assert.hasText(street, "Улица должна быть заполнена!");
        Assert.hasText(city, "Город должен быть заполнен!");

        this.houseNumber = houseNumber;
        this.street = street;
        this.city = city;
    }

    public Address getCopy() {
        return new Address(this.houseNumber, this.street, this.city);
    }
}
