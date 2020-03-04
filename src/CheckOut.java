import java.time.LocalTime;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        int inputCounter = 0;

        ArrayList<Ticket> tickets = new ArrayList<>();
        Ticket ticket;

    //    ticket = new Ticket(1, )

      //  LocalTime now = LocalTime.now();

      //   LocalTime test = now.plusHours(5);
     //    long differenceInHours = java.time.Duration.between(now, test).toHours();
       //  System.out.println("There is a " + differenceInHours + " hour difference.");



        //first display screen for the person parking
        do{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Best Value Parking Garage \n========================= ");
        System.out.println("1 – Check out");
        System.out.println("2 – Lost Ticket");
        System.out.println("=>");
        inputCounter = keyboard.nextInt();
        }while(inputCounter != 1 && inputCounter != 2);


        if (inputCounter == 1) {
            for(Ticket printTicket : tickets){
                System.out.println("");
                System.out.println("Best Value Parking Garage \n========================= ");
                System.out.println("Receipt for vehicle ID " + printTicket.getidNumber());
                System.out.println("Vehicle checked in at " + printTicket.getTime());
            }

        } else if (inputCounter == 2) {
            System.out.println("second");
        }


    }
}