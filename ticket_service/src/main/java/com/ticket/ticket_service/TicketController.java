package com.ticket.ticket_service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tickets")
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;

    @PostMapping("")
    public ResponseEntity<String>buyTicket(@RequestBody TicketRequest ticketRequest){
        return ResponseEntity.ok(ticketService.createTicket(ticketRequest));

    }

    @GetMapping("")
    public ResponseEntity<List<Ticket>>getAll(){
        return ResponseEntity.ok(ticketService.getAll());
    }
}
