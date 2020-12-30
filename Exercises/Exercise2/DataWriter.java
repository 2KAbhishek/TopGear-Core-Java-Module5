import java.io.*;
import java.util.*;

public class DataWriter implements Serializable {
    Long time = Long.valueOf(3600);
    Double age = Double.valueOf(1);
    Date date = new Date(time);

    public static void main(String[] args) {
        DataWriter dw = new DataWriter();
        try {
            FileOutputStream fos = new FileOutputStream("./Written.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dw);
            System.out.println("Written to file.\n");
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("./Written.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            DataWriter dwr = (DataWriter) ois.readObject();
            System.out.println("Read objects from file:\n");
            System.out.println(dwr.date);
            System.out.println(dwr.age);
            System.out.println(dwr.time);
            fis.close();
            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
