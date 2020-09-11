package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь для обслуживания
 */
@Data
public class Client extends Person {

    Address address;
    Company company;
    List<Equipment> equipments = new ArrayList<>();
}
