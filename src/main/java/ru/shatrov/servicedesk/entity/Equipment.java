package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Оборудование пользователя
 */
@Data
public class Equipment extends AbstractEntity {

    String serialNumber;
    String nameEquipment;
    List<Client> clients = new ArrayList<>();
}
