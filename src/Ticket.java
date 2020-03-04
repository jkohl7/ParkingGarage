import java.time.LocalTime;

public class Ticket {

    private int idNumber;
    private String time;


    public Ticket(int idNumber){
        this.idNumber = idNumber;


    }

    public int getidNumber() {
        return idNumber;
    }

    public void setidNumber(int idNumber) {
        this.idNumber = idNumber;
    }

}
