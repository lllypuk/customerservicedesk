package ru.shatrov.servicedesk.entity;

import lombok.Data;

/**
 * Компания
 */
@Data
public class Company extends AbstractEntity {

    String name;
    String inn;
}
