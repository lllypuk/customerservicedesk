package ru.shatrov.servicedesk.entity;

import lombok.Data;

@Data
public class Person extends AbstractEntity {

    private String fullName;
    private String phoneNumber;
}
