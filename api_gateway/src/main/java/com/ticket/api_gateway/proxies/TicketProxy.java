package com.ticket.api_gateway.proxies;

import com.ticket.api_gateway.dto.Ticket;
import com.ticket.api_gateway.dto.TicketRequest;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="ticket-service", path = "tickets")
@RibbonClient(name="ticket-service")
public interface TicketProxy {

    @PostMapping("")
    ResponseEntity<String> buyTicket(@RequestBody TicketRequest ticketRequest);

    @GetMapping("")
    ResponseEntity<List<Ticket>>getAll();
}
