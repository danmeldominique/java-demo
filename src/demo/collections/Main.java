package demo.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import demo.collections.Theatre.Seat;

public class Main {

    public static void main(String[] args) {

        //Collections
        
        // Theatre theatre = new Theatre("Olympian", 8, 12);
        // List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        // Collections.reverse(reverseSeats);
        // //printList(reverseSeats);

        // List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        // priceSeats.add(theatre.new Seat("B00", 13.00));
        // priceSeats.add(theatre.new Seat("A00", 13.00));
        // Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        // printList(priceSeats);

    }

    public static void printList(Collection<Seat> collection) {
        for (Theatre.Seat seat : collection) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println("=================================");
    }
}
