package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;

/**
 * Пользователь системы
 */
@Document
@Getter
@Setter
@RequiredArgsConstructor
public class User {

    @Id
    @NonNull
    private String userName;
    @NonNull
    private String password;

    private Person person;

    private Set<Role> roles = new HashSet<>();
}
