import java.io.*;

public class ConsoleFileReader {
    private BufferedReader br = null;
    private PrintWriter pw = new PrintWriter(System.out, true);

    /* Read from file and print to console */
    public void readFromFile() throws IOException {
        try {
            br = new BufferedReader(new FileReader("./ConsoleFileReaderDemo.java"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        String s = null;
        while ((s = br.readLine()) != null) {
            pw.println(s);
        }
    }

}
