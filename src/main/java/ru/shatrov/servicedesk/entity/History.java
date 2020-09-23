package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.shatrov.servicedesk.enumeration.HistoryType;

/**
 * История изменения сущностей
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class History extends AbstractEntity {

    private User creator;
    private String comment;
    private HistoryType historyType;
    private AbstractEntity entity;
}
