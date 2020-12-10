package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Абстрактная сущность
 */
@Getter
@Setter
public abstract class AbstractEntity implements Serializable {

    @Id
    private String id;
    private LocalDateTime createDateTime = LocalDateTime.now();
    private LocalDateTime updateDateTime = LocalDateTime.now();
    private LocalDateTime deleteDateTime;
}
