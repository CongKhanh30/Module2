package Test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            FileReader fr = new FileReader(file);
            char[] buffer = new char[1024];
            int length;
            while ((length = fr.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, length));
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}







