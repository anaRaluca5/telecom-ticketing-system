package org.example.telecomticketing.service;

import org.example.telecomticketing.model.Ticket;
import org.example.telecomticketing.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository= ticketRepository;
    }

    public List<Ticket> getAllTickets(){
        return ticketRepository.findAll();
    }

   public Ticket getTicketById(Long id){
        return ticketRepository.findById(id).orElse(null);
   }

   public Ticket createTicket(Ticket ticket){
        if ( ticket.getStatus()==null || ticket.getStatus().isBlank())
            ticket.setStatus("OPEN");
        return ticketRepository.save(ticket);
   }

   public Ticket updateTicketStatus(Long id, Ticket updatedTicket){
        Ticket ticket = ticketRepository.findById(id).orElse(null);

        if (ticket == null)
            return null;

        ticket.setStatus(updatedTicket.getStatus());
        return ticketRepository.save(ticket);
   }

   public void deleteTicket(Long id){
        ticketRepository.deleteById(id);
   }
}
