package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Оборудование пользователя
 */
@Data
public class Equipment extends AbstractEntity {

    private String serialNumber;
    private String nameEquipment;
    private Address address;
    private List<Client> clients = new ArrayList<>();
}
