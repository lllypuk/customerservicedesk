package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Адрес пользователя
 */
@Document
@Getter
@Setter
public class Address extends AbstractEntity {

    private String fullAddress;
}
