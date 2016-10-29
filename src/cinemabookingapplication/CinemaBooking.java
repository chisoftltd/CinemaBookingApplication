/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabookingapplication;

/**
 *
 * @author 1609963
 */
class CinemaBooking {

    final int NUMSEATS;
    int numSeatsFree;

    CinemaBooking(int numberOfFreeSeats, int numberOfseatsCinema) {
        this.numSeatsFree = numberOfFreeSeats;
        this.NUMSEATS = numberOfseatsCinema;

    }

    public void setNumSeatsFree(int numSeatsFree) {
        this.numSeatsFree = numSeatsFree;
    }

    public int getNUMSEATS() {
        return NUMSEATS;
    }

    public int getNumSeatsFree() {
        return numSeatsFree;
    }

    public int book(int seats) {
        if ((getNumSeatsFree() - seats) <= 0) {
            System.out.println("Sorry, we have the following free!");
            return numSeatsFree;
        }
        return numSeatsFree -= seats;
    }

    public int cancel(int seats) {
        if ((getNumSeatsFree() + seats) >= getNUMSEATS()) {
            System.out.println("Sorry, all seats are free!");
            return getNUMSEATS() - numSeatsFree;
        }
        return numSeatsFree += seats;
    }

}
