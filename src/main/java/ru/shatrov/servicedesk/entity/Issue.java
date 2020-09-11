package ru.shatrov.servicedesk.entity;

import lombok.Data;
import ru.shatrov.servicedesk.enumeration.IssueStatus;

import java.time.ZonedDateTime;

/**
 * Проблема пользователя
 */
@Data
public class Issue extends AbstractEntity {

    String number;
    IssueStatus issueStatus = IssueStatus.CREATED;
    Client client;
    Equipment equipment;
    String descriptionIssue;
    Person executor;
    ZonedDateTime resolveDateTime;
    String resolveComment;
}
