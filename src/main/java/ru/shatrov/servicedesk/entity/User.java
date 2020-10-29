package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь системы
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity {

    private String userName;
    private String password;
    @ManyToOne
    private Person person;

    @OneToMany
    private List<Role> roles = new ArrayList<>();
}
