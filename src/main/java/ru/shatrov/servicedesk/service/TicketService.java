package ru.shatrov.servicedesk.service;

import ru.shatrov.servicedesk.entity.Ticket;

import java.util.Optional;

/**
 * author Shatrov create date 11.12.2020
 */
public interface TicketService {

    Optional<Ticket> save(Ticket ticket);
}
