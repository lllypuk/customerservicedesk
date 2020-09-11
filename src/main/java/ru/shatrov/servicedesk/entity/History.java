package ru.shatrov.servicedesk.entity;

import lombok.Data;
import ru.shatrov.servicedesk.enumeration.HistoryType;

@Data
public class History extends AbstractEntity {

    User creator;
    String comment;
    HistoryType historyType;
    AbstractEntity entity;
}
