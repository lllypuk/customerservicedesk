package ru.shatrov.servicedesk.entity;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Компания
 */
@Document
@Getter
@Setter
public class Company extends AbstractEntity {

    private String name;
    private String inn;

    public Company(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }
}
