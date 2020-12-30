import java.io.*;

public class LineReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileIn = new FileInputStream("../Exercises/Exercise3/ConsoleFileReader.java");
        DataInputStream dataIn = new DataInputStream(fileIn);
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(dataIn));
        String line;
        System.out.println("Contents of File:\n");
        while ((line = bufRead.readLine()) != null)
            System.out.println(line);
        dataIn.close();
        fileIn.close();
    }
}
