import java.util.IdentityHashMap;
import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        int inputCounter = 0;

        //first display screen for the person parking
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Best Value Parking Garage ========================= ");
        System.out.println("1 – Check-Out");
        System.out.println("2 – Lost Ticket");
        System.out.println("=>");
        inputCounter = keyboard.nextInt();

        //makes the user enter either 1 or 2
        if (inputCounter != 1 || inputCounter != 2) {
            System.out.println("Best Value Parking Garage ========================= ");
            System.out.println("Please enter either 1 or 2");
            System.out.println("1 – Check-Out");
            System.out.println("2 – Lost Ticket");
            System.out.println("=>");
            inputCounter = keyboard.nextInt();
        }

        if (inputCounter == 1) {
            System.out.println("first");

        } else if (inputCounter == 2) {
            System.out.println("second");
        }


    }
}