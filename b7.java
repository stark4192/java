import java.io.File;
import java.io.IOException;

public class b7 {
    public static void main(String[] args) {

        File myFile = new File("CWH_file1.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}