package practice2.studentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteStudent {
    public List<Student> readFile() {
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader("src/practice2/studentManagement/data.csv"));
            List<Student> data = new ArrayList<>();
            String[] lineData;
            String line = "";
            while ((line = br.readLine()) != null) {
                lineData = line.split(",");
                Student student = new Student(Integer.parseInt(lineData[0]), lineData[1], Integer.parseInt(lineData[2]), lineData[3]);
                data.add(student);
            }
            br.close();
            return data;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeFile(List<Student> list) {
        BufferedWriter bw;
        try {
            bw = new BufferedWriter(new FileWriter("src/practice2/studentManagement/data.csv"));
            for (Student s : list) {
                bw.write(s.getId() + "," + s.getFullName() + "," + s.getAge() + "," + s.getHometown() + "\n");
            }
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}