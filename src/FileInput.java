import java.io.*;
import java.util.ArrayList;

public class FileInput implements Serializable {
    public ArrayList<Ticket> readFile(String fileName)  throws IOException {

        ArrayList tickets = new ArrayList();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object obj;

        try{
            while ((obj = ois.readObject())!=null){
                tickets = (ArrayList)obj;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            System.out.println("File does not exist");
        }
        return tickets;

    }






}
