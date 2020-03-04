
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) {
        int inputCounter = 0;
        int idCounter = 0;
        ArrayList<Ticket> tickets = new ArrayList<>();
        Ticket ticket;



        //First display for the user
       // do{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Best Value Parking Garage \n========================= ");
            System.out.println("1 – Check-In");
            System.out.println("2 – Close Garage");
            System.out.println("=>");
            inputCounter = keyboard.nextInt();
       // }while(inputCounter != 1 || inputCounter != 2);

        //displays the vehicle id for check-in and adds a new ticket to the array list.
        if (inputCounter == 1){
            idCounter++;
            System.out.println("Best Value Parking Garage \n========================= ");
            System.out.println("Your vehicle ID is " + idCounter);
            ticket = new Ticket(idCounter);
            tickets.add(ticket);

            for(Ticket printTicket : tickets){
                System.out.println("");
                System.out.println("Receipt for vehicle ID " + printTicket.getidNumber());
            }


        }else if(inputCounter == 2){
            System.out.println("second");
           LocalTime time = LocalTime.now();
           System.out.println(time.toString());
        }


    }
}
