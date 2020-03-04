
import java.time.LocalDate;
import java.util.ArrayList;
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
            System.out.println("Best Value Parking Garage ========================= ");
            System.out.println("1 – Check-In");
            System.out.println("2 – Close Garage");
            System.out.println("=>");
            inputCounter = keyboard.nextInt();
       // }while(inputCounter != 1 || inputCounter != 2);

        if (inputCounter == 1){
            idCounter++;
            System.out.println("Your vehicle ID is " + idCounter + ". Re-Enter the ID to confirm.");
            Scanner newInfo = new Scanner(System.in);
            int id = newInfo.nextInt();
            ticket = new Ticket(id);
            tickets.add(ticket);

            System.out.println(tickets);


        }else if(inputCounter == 2){
            System.out.println("second");
        }


    }
}
