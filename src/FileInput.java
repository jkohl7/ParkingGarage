import javax.print.attribute.standard.NumberUp;
import java.io.*;
import java.util.ArrayList;

public  class FileInput implements Serializable {
    public static ArrayList<Ticket> readFile(String fileName)  {

        ArrayList tickets = new ArrayList();

        FileInputStream fis;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
        }catch (FileNotFoundException e ){
            System.out.println("File does not exist");
        }catch(IOException e){
            System.out.println("IOExeption caught");
        }

        Object obj;

        try{
            while ((obj = ois.readObject())!=null){
                //obj = ois.readObject();
                tickets = (ArrayList) obj;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (EOFException e){

        } catch (IOException e){
            //System.out.println("File does not exist1");
        }catch (NullPointerException e){
            ArrayList another = new ArrayList<Ticket>();
            return another;
        }
        return tickets;

    }

}
