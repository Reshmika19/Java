package Application.RailwayReservatiom;

import java.sql.ClientInfoStatus;
import java.util.*;

public class TicketBook {

    static int aLB = 3;
    static int aMB = 2;
    static int aUP = 1;
    static int aRac = 2 ;
    static int aWL = 2;

    static List<Integer> lbP = new ArrayList<>(Arrays.asList(1,2,3));
    static List<Integer> mbP = new ArrayList<>(Arrays.asList(1,2));
    static List<Integer> ubP = new ArrayList<>(Arrays.asList(1));
    static List<Integer> wlP = new ArrayList<>(Arrays.asList(1,2));
    static List<Integer> racP = new ArrayList<>(Arrays.asList(1,2));

    static Queue<Integer> wlList = new LinkedList<Integer>();
    static Queue<Integer> racList = new LinkedList<Integer>();
    static List<Integer> bookedTicketList = new ArrayList<>();

    Map<Integer,Passenger> passengerMap = new HashMap<>();

    public void bookTicket(Passenger p , int berthSeat , String allotedBerth){
        p.number = berthSeat;
        p.allotedBerth = allotedBerth;
        passengerMap.put(p.passengerId , p);
        bookedTicketList.add(p.passengerId);
        System.out.println("-------Booked Successfully-------");
    }

    public void addToRAC(Passenger p , int berthSeat , String alloted){
        p.number = berthSeat;
        p.allotedBerth = alloted;
        passengerMap.put(p.passengerId , p);
        racList.add(p.passengerId);
        aRac--;
        racP.remove(0);
        System.out.println("-------Added to RAC-------");
    }

    public void addToWl(Passenger p , int berthSeat , String alloted){
        p.number = berthSeat;
        p.allotedBerth = alloted;
        passengerMap.put(p.passengerId , p);
        wlList.add(p.passengerId);
        wlList.remove(0);
        aWL--;
        System.out.println("-------Added to Waiting List-------");
    }

    public void cancelTicket(int id){
        System.out.println("Ticket cancelled");    }
}
