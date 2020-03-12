import java.io.*;
import java.util.ArrayList;

public class FileOutput implements Serializable {
    public static void writeFile(String fileName, ArrayList<Ticket> tickets){


        FileOutputStream fos;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
        }catch (FileNotFoundException e ){
            System.out.println("File does not exist. (The program must run once to create the needed File.)");
        }catch(IOException e){
            System.out.println("IOExeption caught");
        }

        try {

                oos.writeObject(tickets);

            oos.close();
        }catch (IOException e){
            System.out.println("c");
        }
}


}
