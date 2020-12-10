package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь для обслуживания
 */
@Document
@Getter
@Setter
public class Client extends Person {

    private Address address;
    private Company company;

    private List<Equipment> equipments = new ArrayList<>();
}
