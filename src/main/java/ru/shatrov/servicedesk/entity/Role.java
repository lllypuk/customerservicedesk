package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

/**
 * Роль пользователя
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Role extends AbstractEntity {

    private String name;
}
