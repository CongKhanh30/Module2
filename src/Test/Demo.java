package Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            String data = "Hello, Quang!";
            File file = new File("example.txt");
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
