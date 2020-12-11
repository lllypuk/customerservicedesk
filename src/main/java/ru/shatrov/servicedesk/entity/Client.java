package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Пользователь для обслуживания
 */
@Document
@Getter
@Setter
public class Client extends AbstractDocument {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;

    private Company company;
    private Address address;
}
