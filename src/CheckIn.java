import java.text.ParseException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class CheckIn {
    public static void main(String[] args) throws ParseException {
        int inputCounter = 0;
        int idCounter = 0;
        int loopCounter = 0;

        double minimumFee = 5.00;
        double perHour = 1.00;
        double maximumFee = 15.00;
        double lostTicket = 25.00;

        ArrayList<Ticket> tickets = FileInput.readFile("data");

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
            Ticket ticket;
            idCounter = tickets.size()+1;


            LocalTime checkIn = LocalTime.now();
            ticket = new Ticket(idCounter, checkIn);
            tickets.add(ticket);


                System.out.println("");
                System.out.println("Best Value Parking Garage \n========================= ");
                System.out.println("Vehicle submitted successfully. Your ID is " + ticket.getidNumber());
                System.out.println("Vehicle checked in at " + ticket.getStartTime().format(DateTimeFormatter.ofPattern("hh:mm a")));


            FileOutput.writeFile("data", tickets);



            //*******************************************READ THIS****************************************************//
            //I was not able to get my Close Garage to work. I was having some trouble with getting my LocalTime's to //
            //compare and I did not have enough time to get this portion to work correctly. The data entered here is  //
            //just some place holder data. I would have used the similar calculations that I used from the Check-Out  //
            //machine.
            //*******************************************READ THIS***************************************************//

        }else if(inputCounter == 2){
            System.out.println("Best Value Parking Garage \n========================= ");
            System.out.println("Activity to Date");
            System.out.println("$40 was collected from 4 Check-ins");
            System.out.println("$50 was collected from 2 Lost Tickets");
            System.out.println("$90 was collected overall");

            for(Ticket t : tickets) {
                if(loopCounter < t.getidNumber()){
                    loopCounter++;
//                    long differenceInHours = t.getEndTime() - t.getStartTime();
//
//                   System.out.println("Cost of parking will be: $" + (minimumFee + perHour * differenceInHours));

             }

            }
        }

    }
}
