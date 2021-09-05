package com.ticket.ticket_server;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketServiceImpl implements TicketService{

    private final TicketRepository ticketRepository;

    @Override
    public String createTicket(TicketRequest ticketRequest) {
        Ticket ticket=new Ticket();
        ticket.setUserId(ticketRequest.getUserId());
        ticketRepository.save(ticket);
        return "ticket booked";
    }

    @Override
    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }
}
