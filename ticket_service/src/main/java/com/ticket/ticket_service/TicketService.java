package com.ticket.ticket_service;

import java.util.List;

public interface TicketService {

    String createTicket(TicketRequest ticketRequest);

    List<Ticket> getAll();
}
