package ru.shatrov.servicedesk.entity;

import lombok.Data;

/**
 * Компания
 */
@Data
public class Company extends AbstractEntity {

    private String name;
    private String inn;
}
