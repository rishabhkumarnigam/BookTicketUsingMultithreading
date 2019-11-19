package com.rishabh.multithread.multithreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

@SpringBootApplication
public class MultithreadingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultithreadingApplication.class, args);
	}

	@Bean
	Map<Integer,Ticket> allTickets(){

		Map<Integer,Ticket> mapOfTicket=new HashMap<>();
		mapOfTicket.put(1,new Ticket(1,new ReentrantLock()));
		mapOfTicket.put(2,new Ticket(2,new ReentrantLock()));
		mapOfTicket.put(3,new Ticket(3,new ReentrantLock()));
		mapOfTicket.put(4,new Ticket(4,new ReentrantLock()));
		mapOfTicket.put(5,new Ticket(5,new ReentrantLock()));
		mapOfTicket.put(6,new Ticket(6,new ReentrantLock()));
		mapOfTicket.put(7,new Ticket(7,new ReentrantLock()));
		mapOfTicket.put(8,new Ticket(8,new ReentrantLock()));
		mapOfTicket.put(9,new Ticket(9,new ReentrantLock()));
		mapOfTicket.put(10,new Ticket(10,new ReentrantLock()));

		return mapOfTicket;
	}



}
