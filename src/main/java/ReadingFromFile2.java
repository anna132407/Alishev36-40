import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile2 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readFile() throws FileNotFoundException {
        File file = new File( "asdf");
        Scanner scanner = new Scanner(file);
    }
}
