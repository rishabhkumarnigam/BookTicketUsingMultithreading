package com.rishabh.multithread.multithreading;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.concurrent.locks.ReentrantLock;

public class Ticket  {

  private int seatNumber;

  @JsonIgnore
  private String allocatedTo;

  @JsonIgnore
  private ReentrantLock reentrantLock;

  public Ticket(int seatNumber, String allocatedTo, ReentrantLock reentrantLock) {
    this.seatNumber = seatNumber;
    this.allocatedTo = allocatedTo;
    this.reentrantLock = reentrantLock;
  }

  public Ticket(int seatNumber, ReentrantLock reentrantLock) {
    this.seatNumber = seatNumber;
    this.reentrantLock = reentrantLock;
  }

  public int getSeatNumber() {
    return seatNumber;
  }

  public void setSeatNumber(int seatNumber) {
    this.seatNumber = seatNumber;
  }

  public String getAllocatedTo() {
    return allocatedTo;
  }

  public void setAllocatedTo(String allocatedTo) {
    this.allocatedTo = allocatedTo;
  }

  public ReentrantLock getReentrantLock() {
    return reentrantLock;
  }

  public void setReentrantLock(ReentrantLock reentrantLock) {
    this.reentrantLock = reentrantLock;
  }
}
