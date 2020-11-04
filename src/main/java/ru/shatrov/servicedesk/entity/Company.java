package ru.shatrov.servicedesk.entity;

import lombok.*;

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

    public Company(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public Company() {

    }
}
