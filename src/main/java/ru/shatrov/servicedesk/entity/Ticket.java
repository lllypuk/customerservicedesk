package ru.shatrov.servicedesk.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import ru.shatrov.servicedesk.enumeration.TicketStatus;

import java.time.LocalDateTime;

/**
 * Проблема пользователя
 */
@Document
@Getter
@Setter
public class Ticket extends AbstractDocument {

    private String number;

    private TicketStatus ticketStatus = TicketStatus.CREATED;

    private Customer customer;

    private Equipment equipment;
    private String descriptionIssue;

    private Person executor;
    private LocalDateTime resolveDateTime;
    private String resolveComment;
}
