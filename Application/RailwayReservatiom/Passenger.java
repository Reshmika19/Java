package Application.RailwayReservatiom;

public class Passenger {

    //initialization
    static int id = 1;
    String name ;
    String gender;
    int age ;
    String bp ;
    int passengerId = id++;
    int number ;
    String allotedBerth;

    //constructor
    public Passenger(String name , int age , String gender , String bp ){
        this.name = name;
        this.age = age;
        this.bp = bp;
        this.gender = gender;
        number = -1;
        allotedBerth = " ";
    }
}
