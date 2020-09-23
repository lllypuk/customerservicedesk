package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Персона
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends AbstractEntity {

    private String fullName;
    private String phoneNumber;
}
