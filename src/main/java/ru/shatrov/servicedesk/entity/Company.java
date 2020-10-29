package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Компания
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Company extends AbstractEntity {

    private String name;
    private String inn;
}
