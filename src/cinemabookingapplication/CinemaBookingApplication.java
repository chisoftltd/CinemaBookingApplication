/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemabookingapplication;

import java.util.Scanner;

/**
 *
 * @author 1609963
 */
public class CinemaBookingApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int numberOfFreeSeats;
        int numberOfseatsCinema;
        char choice;
        int bookedSeats;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of seats in Cinema: ");
        numberOfseatsCinema = input.nextInt();
        System.out.println("Enter number of Free seats: ");
        numberOfFreeSeats = input.nextInt();

        System.out.println("'b' book\n'c' cancel \n'q' quit ");
        choice = input.next().charAt(0);
        CinemaBooking cinemaBooking = new CinemaBooking(numberOfFreeSeats, numberOfseatsCinema);

        while (choice != 'b' && choice != 'c' && choice != 'q') {
            System.out.println("Options are\n 'b' book\n'c' cancel\n'q' quit ");
            choice = input.next().charAt(0);
        }
        switch (choice) {
            case 'b':
                System.out.println("Enter number of seats to book: ");
                bookedSeats = input.nextInt();
                cinemaBooking.book(bookedSeats);
                System.out.println("Free seats now is " + Math.abs((int)(cinemaBooking.getNumSeatsFree())));
                break;
            case 'c':
                System.out.println("Enter number of seats to cancel: ");
                bookedSeats = input.nextInt();
                cinemaBooking.cancel(bookedSeats);
                System.out.println("Free seats now is " + cinemaBooking.getNumSeatsFree());
                break;
            case 'q':
                System.out.println("Free seats now is " + cinemaBooking.getNumSeatsFree());
                System.out.println("Bye!");
                System.exit(0);
                break;
            default:
        }

    }

}
