package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Адрес пользователя
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Address extends AbstractEntity {

    private String fullAddress;
}
