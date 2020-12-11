package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Персона
 */
@Document
@Getter
@Setter
public class Person extends AbstractDocument {

    private String fullName;
    private String phoneNumber;
}
