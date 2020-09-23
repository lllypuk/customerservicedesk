package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь для обслуживания
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Client extends Person {

    private Address address;
    private Company company;
    private List<Equipment> equipments = new ArrayList<>();
}
