package com.rishabh.multithread.multithreading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

@Service
public class TicketService {

  @Autowired
  private Map<Integer,Ticket> allTickets;


  public Map<Integer,Ticket> getAllTicketsAvailable(){

    Map<Integer,Ticket> availableTickets=new HashMap<>();
    allTickets.forEach((k,v)->{
      if(!v.getReentrantLock().isLocked()){
        availableTickets.put(k,v);
      }
    });

    return availableTickets;
  }

  public String bookTicket(int seatNumber,String name){


    final Ticket ticket = allTickets.get(seatNumber);
    final ReentrantLock lockForSeat = ticket.getReentrantLock();

    if(!lockForSeat.isLocked()){
    lockForSeat.lock();
    ticket.setReentrantLock(lockForSeat);
      ticket.setAllocatedTo(name);
      allTickets.put(seatNumber,ticket);
      return "Congratulations " + name+" you have booked seat number" + seatNumber;
    }
    return "Failed to book seat";


  }



}
