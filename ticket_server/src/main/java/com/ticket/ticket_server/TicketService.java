package com.ticket.ticket_server;

import java.util.List;

public interface TicketService {

    String createTicket(TicketRequest ticketRequest);

    List<Ticket> getAll();
}
