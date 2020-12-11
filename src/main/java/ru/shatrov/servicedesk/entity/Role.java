package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Роль пользователя
 */
@Document
@Getter
@Setter
public class Role extends AbstractDocument {

    private String name;
}
