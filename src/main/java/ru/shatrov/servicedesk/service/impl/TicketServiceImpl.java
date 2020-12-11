package ru.shatrov.servicedesk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.shatrov.servicedesk.entity.Ticket;
import ru.shatrov.servicedesk.repository.TicketRepository;
import ru.shatrov.servicedesk.service.TicketService;

import java.util.Optional;

/**
 * author Shatrov create date 11.12.2020
 */
@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    public TicketRepository ticketRepository;

    @Override
    public Optional<Ticket> save(Ticket ticket) {
        return Optional.of(ticketRepository.save(ticket));
    }
}
