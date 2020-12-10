package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.shatrov.servicedesk.enumeration.IssueStatus;

import java.time.LocalDateTime;

/**
 * Проблема пользователя
 */
@Document
@Getter
@Setter
public class Issue extends AbstractEntity {

    private String number;

    private IssueStatus issueStatus = IssueStatus.CREATED;

    private Client client;

    private Equipment equipment;
    private String descriptionIssue;

    private Person executor;
    private LocalDateTime resolveDateTime;
    private String resolveComment;
}
