package ru.shatrov.servicedesk.entity;

import lombok.Data;

/**
 * Адрес пользователя
 */
@Data
public class Address extends AbstractEntity {

    String fullAddress;
}
