package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Персона
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Person extends AbstractEntity {

    private String fullName;
    private String phoneNumber;
}
