package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь системы
 */
@Document
@Getter
@Setter
public class User extends AbstractEntity {

    private String userName;
    private String password;

    private Person person;

    private List<Role> roles = new ArrayList<>();
}
