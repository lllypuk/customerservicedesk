package ru.shatrov.servicedesk.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.shatrov.servicedesk.enumeration.IssueStatus;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

/**
 * Проблема пользователя
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Issue extends AbstractEntity {

    private String number;

    @Enumerated(EnumType.ORDINAL)
    private IssueStatus issueStatus = IssueStatus.CREATED;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Equipment equipment;
    private String descriptionIssue;

    @ManyToOne
    private Person executor;
    private LocalDateTime resolveDateTime;
    private String resolveComment;
}
