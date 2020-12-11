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
    private Client client;
    private String descriptionTicket;

    private User executor;
    private LocalDateTime resolveDateTime;
    private String resolveComment;

    public String getDescriptionTicket() {
        return descriptionTicket;
    }

    public void setDescriptionTicket(String descriptionTicket) {
        this.descriptionTicket = descriptionTicket;
    }

    public TicketStatus getTicketStatus() {
        return ticketStatus;
    }
}
