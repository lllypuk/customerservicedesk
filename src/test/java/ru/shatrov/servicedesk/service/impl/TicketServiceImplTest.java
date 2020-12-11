package ru.shatrov.servicedesk.service.impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import ru.shatrov.servicedesk.entity.Ticket;
import ru.shatrov.servicedesk.enumeration.TicketStatus;
import ru.shatrov.servicedesk.repository.TicketRepository;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
class TicketServiceImplTest {

    @MockBean
    private TicketRepository ticketRepository;
    @Autowired
    private TicketServiceImpl ticketService;

    @Test
    void when_save_ticket_it_should_return_ticket() {
        Ticket ticket = new Ticket();
        ticket.setDescriptionTicket("Test");

        when(ticketRepository.save(any(Ticket.class))).thenReturn(ticket);

        Optional<Ticket> result = ticketService.save(ticket);

        assertThat(result.orElseThrow().getDescriptionTicket()).isSameAs(ticket.getDescriptionTicket());
        assertThat(result.orElseThrow().getTicketStatus()).isSameAs(TicketStatus.CREATED);
        assertThat(result.orElseThrow().getCreateDateTime()).isNotNull();
    }
}
