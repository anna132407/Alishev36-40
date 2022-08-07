import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exception3 {
    public static void main(String[] args) {
// Checked Exception(Compile time exception) = исключительные случаи в работе программы
// Unchecked (Runtime exception) = ошибка в работе программы

        try {
            int [] arr = new int[2];
        } catch(RuntimeException e) {

        }
        System.out.println(arr[2]);
    }
}