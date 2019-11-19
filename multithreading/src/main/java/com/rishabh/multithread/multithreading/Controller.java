package com.rishabh.multithread.multithreading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@RestController
@RequestMapping("/ticket")
public class Controller {

  @Autowired
  private TicketService ticketService;


  @GetMapping(value={"/buy/{seatNumber}/{name}","/buy/{seatNumber}"})
  public String buy(@PathVariable Integer seatNumber,
                    @PathVariable Optional<String> name){

    return ticketService.bookTicket(seatNumber,name.map(Function.identity()).orElseGet(()->"auto"));
  }

  @GetMapping("/getAllSeats")
  public Map<Integer,Ticket> getAllSeats(){
return ticketService.getAllTicketsAvailable();
  }



}