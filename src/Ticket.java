import java.time.LocalTime;

public class Ticket {

    private int idNumber;
    private LocalTime time;


    public Ticket(int idNumber, LocalTime time){
        this.idNumber = idNumber;
        this.time = time;
    }

    public Ticket(int idNumber) {
        this.idNumber = idNumber;
    }



    public int getidNumber() {
        return idNumber;
    }

    public void setidNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }
}
