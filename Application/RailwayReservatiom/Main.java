package Application.RailwayReservatiom;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean loop = true; //always true , for while

        System.out.println("------Railway Reservation System------");

        while(loop) {
            System.out.println("1. Book Tickets \n2. Cancel Tickets \n3. Available Tickets \n4. Booked Tickets \n5. Exit");
            int choice = sc.nextInt();

            switch (choice) {

                case 1 :

                    //getting passenger details
                    System.out.println("Enter Passenger Name : ");
                    String name = sc.next();
                    System.out.println("Enter Passenger Age  :  ");
                    int age = sc.nextInt();
                    System.out.println("Enter Passenger Gender [M , F] : ");
                    String gender = sc.next();
                    System.out.println("Enter Passenger Berth Perference [L , M , U ] : ");
                    String bp = sc.next();

                    Passenger p = new Passenger(name , age ,gender , bp);
                    bookTicket(p);

                    break;

                case 2:
                    //cancel
                    System.out.println("Enter Passenger Id to cancel : ");
                    int id = sc.nextInt();
                    cancelTicket(id);


                case 5:
                    loop = false;
                    break;

            }
        }

    }

    private static void bookTicket(Passenger p) {

        TicketBook booker = new TicketBook();

        if(TicketBook.aWL == 0){
            System.out.println("No Tickets Available");
            return;
        }

        if((p.bp.equals("L") && TicketBook.aLB > 0) ||
                (p.bp.equals("M") && TicketBook.aMB > 0) ||
                (p.bp.equals("U") && TicketBook.aUP > 0)){

            System.out.println("Preferred Birth Available");

            if(p.bp.equals("L")){
                System.out.println("Lower Berth is given");
                booker.bookTicket(p,(TicketBook.lbP.get(0)),"L");
                TicketBook.lbP.remove(0);
                TicketBook.aLB--;
            }
            else if(p.bp.equals("M")){
                System.out.println("Middle Berth is given");
                booker.bookTicket(p,(TicketBook.mbP.get(0)) , "M");
                TicketBook.mbP.remove(0);
                TicketBook.aMB--;
            }
            else if (p.bp.equals("U")) {
                System.out.println("Upper Berth is given");
                booker.bookTicket(p,(TicketBook.ubP.get(0)) , "U");
                TicketBook.ubP.remove(0);
                TicketBook.aUP--;

            }

        }
        else if (TicketBook.aLB > 0) {
            System.out.println("Lower Berth is given");
            booker.bookTicket(p,(TicketBook.lbP.get(0)) , "L");
            TicketBook.lbP.remove(0);
            TicketBook.aLB--;
        } else if (TicketBook.aMB > 0) {
            System.out.println("Middle Birth is given");
            booker.bookTicket(p , (TicketBook.mbP.get(0)) , "M");
            TicketBook.mbP.remove(0);
            TicketBook.aMB--;

        }else if(TicketBook.aUP > 0){
            System.out.println("Upper Birth is given");
            booker.bookTicket(p , (TicketBook.ubP.get(0)) , "U");
            TicketBook.ubP.remove(0);
            TicketBook.aUP--;
        } else if (TicketBook.aRac> 0) {
            System.out.println("RAC Available");
            booker.addToRAC(p,(TicketBook.racP.get(0)) , "RAC");
        } else if (TicketBook.aWL>0) {
            System.out.println("Waiting List");
            booker.addToWl(p,(TicketBook.wlP.get(0)) ,"WL");

        }


    }
    private static void cancelTicket(int id){
        TicketBook booker = new TicketBook();
        if(booker.passengerMap.containsKey(id))
            booker.cancelTicket(id);
        else
        {
            System.out.println("Invalid User");
            return;
        }
    }
}
