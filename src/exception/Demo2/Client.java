package exception.Demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException exception) {
            throw new RuntimeException(exception);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile() throws FileNotFoundException, IOException {
        File file = new File("abc.txt");
        FileReader reader = new FileReader(file);
        reader.read();
    }
}
