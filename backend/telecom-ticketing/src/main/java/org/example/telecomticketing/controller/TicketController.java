package org.example.telecomticketing.controller;

import org.example.telecomticketing.model.Ticket;
import org.example.telecomticketing.service.TicketService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

import java.util.List;

@RestController
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/api/tickets")
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/api/tickets/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping("/api/tickets")
    public Ticket createTicket(@Valid @RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }

    @PutMapping("/api/tickets/{id}/status")
    public Ticket updateTicketStatus(@PathVariable Long id, @RequestBody Ticket updatedTicket) {
        return ticketService.updateTicketStatus(id, updatedTicket);
    }

    @DeleteMapping("/api/tickets/{id}")
    public void deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
    }
}
