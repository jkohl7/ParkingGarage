import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class CheckIn {
    public static void main(String[] args) {


        int inputCounter = 0;
        int idCounter = 0;
        String time;
        ArrayList<Ticket> tickets = new ArrayList<>();
        Ticket ticket;





        //First display for the user
        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Best Value Parking Garage \n========================= ");
            System.out.println("1 – Check-In");
            System.out.println("2 – Close Garage");
            System.out.println("=>");
            inputCounter = keyboard.nextInt();
        }while(inputCounter != 1 && inputCounter != 2);

        //displays the vehicle id for check-in and adds a new ticket to the array list.
        if (inputCounter == 1){
            idCounter++;
          //  LocalTime test = now.plusHours(5);
          //  long differenceInHours = java.time.Duration.between(now, test).toHours();
          //  System.out.println("There is a " + differenceInHours + " hour difference.");


           // System.out.println("Your check-in time is " + now );
            LocalTime checkIn = LocalTime.now();
            ticket = new Ticket(idCounter, checkIn);
            tickets.add(ticket);


            for(Ticket printTicket : tickets){
                System.out.println("");
                System.out.println("Best Value Parking Garage \n========================= ");
                System.out.println("Vehicle submitted successfully. Your ID is " + printTicket.getidNumber());
                System.out.println("Vehicle checked in at " + printTicket.getStartTime());
            }


        }else if(inputCounter == 2){
            System.out.println("second");

        }


    }
}
