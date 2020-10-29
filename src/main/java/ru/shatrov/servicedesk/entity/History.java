package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.shatrov.servicedesk.enumeration.HistoryType;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

/**
 * История изменения сущностей
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class History extends AbstractEntity {

    @ManyToOne
    private User creator;
    private String comment;

    @Enumerated(EnumType.ORDINAL)
    private HistoryType historyType;
}
