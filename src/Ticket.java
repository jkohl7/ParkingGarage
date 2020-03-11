import java.time.LocalTime;

public class Ticket {

    private int idNumber;
    private LocalTime startTime;
    private LocalTime endTime;



    public Ticket(int idNumber, LocalTime startTime){
        this.idNumber = idNumber;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
