package ru.shatrov.servicedesk.entity;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Абстрактная сущность
 */
@Data
public abstract class AbstractEntity {

    private UUID id;
    private LocalDateTime createDateTime;
    private LocalDateTime updateDateTime;
    private LocalDateTime deleteDateTime;
    private List<History> histories = new ArrayList<>();
}
