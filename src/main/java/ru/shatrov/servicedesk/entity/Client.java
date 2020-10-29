package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Пользователь для обслуживания
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Client extends Person {

    @ManyToOne
    private Address address;
    @ManyToOne
    private Company company;

    @OneToMany
    private List<Equipment> equipments = new ArrayList<>();
}
