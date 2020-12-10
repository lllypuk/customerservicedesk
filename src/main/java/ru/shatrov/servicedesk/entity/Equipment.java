package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Оборудование пользователя
 */
@Document
@Getter
@Setter
public class Equipment extends AbstractEntity {

    private String serialNumber;
    private String nameEquipment;

    private Address address;

    private List<Client> clients = new ArrayList<>();
}
