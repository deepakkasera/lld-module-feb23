package exception.Demo1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello");
        System.out.println("Hey");

//        File file = new File("abc.txt");
//        FileReader fileReader = new FileReader(file);
//        fileReader.read();

        try{
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            //System.exit(0);

            int c = x/y;
            System.out.println("Scaler");
        } catch (ArithmeticException exception) {
            System.out.println("Please enter the right type of input.");
        } finally {
            //finally block won't execute only if we exit form the application explicitly.
            System.out.println("finally block");
        }
        System.out.println("Hi");
    }


}
