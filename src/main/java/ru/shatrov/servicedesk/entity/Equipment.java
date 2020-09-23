package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Оборудование пользователя
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Equipment extends AbstractEntity {

    private String serialNumber;
    private String nameEquipment;
    private Address address;
    private List<Client> clients = new ArrayList<>();
}
