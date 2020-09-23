package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Компания
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Company extends AbstractEntity {

    private String name;
    private String inn;
}
