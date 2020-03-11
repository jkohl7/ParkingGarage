
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        int inputCounter = 0;
        int idInput;
        int lostTickets;
        double minimumFee = 5.00;
        double perHour = 1.00;
        double maximumFee = 15.00;
        double lostTicket = 25.00;
        double finalFee;

        ArrayList<Ticket> tickets = FileInput.readFile("data");


    //    ticket = new Ticket(1, )

      //  LocalTime now = LocalTime.now();

      //   LocalTime test = now.plusHours(5);
     //    long differenceInHours = java.time.Duration.between(now, test).toHours();
       //  System.out.println("There is a " + differenceInHours + " hour difference.");



        //first display screen for the person leaving
        do{
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Best Value Parking Garage \n========================= ");
        System.out.println("1 – Check out");
        System.out.println("2 – Lost Ticket");
        System.out.println("=>");
        inputCounter = keyboard.nextInt();
        }while(inputCounter != 1 && inputCounter != 2);


        if (inputCounter == 1) {
            System.out.println("What was your vehicle ID?: ");
            Scanner input = new Scanner(System.in);
            idInput = Integer.parseInt(input.nextLine());


            for(Ticket t : tickets) {
                if(idInput == t.getidNumber()){
                 //   t.setEndTime();
                }
            }

        } else if (inputCounter == 2) {
            System.out.println("second");
        }


    }
}