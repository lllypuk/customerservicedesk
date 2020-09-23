package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Адрес пользователя
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Address extends AbstractEntity {

    private String fullAddress;
}
