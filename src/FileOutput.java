import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class FileOutput implements Serializable {
    public void writeFile(String fileName, ArrayList<Ticket> tickets) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Ticket t : tickets){
            oos.writeObject(t);
        }
        oos.close();
    }


}
