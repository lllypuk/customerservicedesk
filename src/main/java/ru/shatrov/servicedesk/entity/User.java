package ru.shatrov.servicedesk.entity;

import lombok.Data;
import ru.shatrov.servicedesk.enumeration.RoleName;

import java.util.ArrayList;
import java.util.List;

@Data
public class User extends AbstractEntity {

    private String userName;
    private String password;
    private Person person;
    private List<RoleName> roles = new ArrayList<>();
}
