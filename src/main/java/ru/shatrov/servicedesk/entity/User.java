package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.shatrov.servicedesk.enumeration.RoleName;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь системы
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {

    private String userName;
    private String password;
    private Person person;
    private List<RoleName> roles = new ArrayList<>();
}
