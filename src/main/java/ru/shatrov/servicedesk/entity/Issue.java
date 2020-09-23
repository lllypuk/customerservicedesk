package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.shatrov.servicedesk.enumeration.IssueStatus;

import java.time.ZonedDateTime;

/**
 * Проблема пользователя
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Issue extends AbstractEntity {

    private String number;
    private IssueStatus issueStatus = IssueStatus.CREATED;
    private Client client;
    private Equipment equipment;
    private String descriptionIssue;
    private Person executor;
    private ZonedDateTime resolveDateTime;
    private String resolveComment;
}
