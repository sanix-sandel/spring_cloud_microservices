package com.ticket.api_gateway.rest;

import com.ticket.api_gateway.dto.Ticket;
import com.ticket.api_gateway.dto.TicketRequest;
import com.ticket.api_gateway.proxies.TicketProxy;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ticket-service")
@RequiredArgsConstructor
public class TicketController {

    private final TicketProxy ticketProxy;

    @PostMapping("/tickets")
    ResponseEntity<String> buyTicket(@RequestBody TicketRequest ticketRequest){
        return ticketProxy.buyTicket(ticketRequest);
    }

    @GetMapping("/tickets")
    ResponseEntity<List<Ticket>>getAll(){
        return ticketProxy.getAll();
    }

}
