package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class User extends AbstractEntity {

    String userName;
    String password;
    Person person;
    List<Role> roles = new ArrayList<>();
}
