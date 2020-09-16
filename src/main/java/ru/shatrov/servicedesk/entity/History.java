package ru.shatrov.servicedesk.entity;

import lombok.Data;
import ru.shatrov.servicedesk.enumeration.HistoryType;

@Data
public class History extends AbstractEntity {

    private User creator;
    private String comment;
    private HistoryType historyType;
    private AbstractEntity entity;
}
