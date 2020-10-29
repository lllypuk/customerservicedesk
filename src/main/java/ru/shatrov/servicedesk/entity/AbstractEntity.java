package ru.shatrov.servicedesk.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Абстрактная сущность
 */
@Data
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDateTime createDateTime = LocalDateTime.now();
    private LocalDateTime updateDateTime = LocalDateTime.now();
    private LocalDateTime deleteDateTime;

    @OneToMany
    private List<History> histories = new ArrayList<>();
}
