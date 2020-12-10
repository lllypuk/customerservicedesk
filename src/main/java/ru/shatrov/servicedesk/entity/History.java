package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.shatrov.servicedesk.enumeration.HistoryType;

/**
 * История изменения сущностей
 */
@Document
@Getter
@Setter
public class History extends AbstractEntity {

    private User creator;
    private String comment;

    private HistoryType historyType;
}
