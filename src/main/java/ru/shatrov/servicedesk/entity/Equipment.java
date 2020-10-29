package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Оборудование пользователя
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Equipment extends AbstractEntity {

    private String serialNumber;
    private String nameEquipment;
    @ManyToOne
    private Address address;
    @OneToMany
    private List<Client> clients = new ArrayList<>();
}
