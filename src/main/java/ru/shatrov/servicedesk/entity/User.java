package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.shatrov.servicedesk.enumeration.Role;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Пользователь системы
 */
@Document
@Getter
@Setter
@RequiredArgsConstructor
public class User implements Serializable {

    @Id
    @NonNull
    private String userName;
    @NonNull
    private String password;

    private Set<Role> roles = new HashSet<>();
}
