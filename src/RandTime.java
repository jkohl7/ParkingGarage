import java.time.LocalTime;

public class RandTime {

    RandTime random = new RandTime();

    public static LocalTime getRandomTime(LocalTime lowestTime, LocalTime highestTime){
        //step 1: generate a random string in format that can be maybe parsed as time

        //format example: "12:55"

        //step 2: check if it can be converted to time, if not repeat step 1
        //step 3: check if time is between lowest time and highest time, if not repeat step 1

        return LocalTime.now();    }

}
