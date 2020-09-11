package ru.shatrov.servicedesk.entity;

import lombok.Data;

@Data
public class Person extends AbstractEntity {

    String fullName;
    String phoneNumber;
}
