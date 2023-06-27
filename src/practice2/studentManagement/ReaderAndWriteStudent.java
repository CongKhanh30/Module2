package practice2.studentManagement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReaderAndWriteStudent {
    File file = new File("src/practice2/studentManagement/data.csv");

    public void writeFile(Student student) {
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            String data = "";
            while ((line = bufferedReader.readLine()) != null) {
                data += line + "\n";
            }
            bufferedReader.close();
            data += student.getId() + "," + student.getFullName() + "," + student.getAge() + "," + student.getHometown();
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public List<Student> readFile() {
        List<Student> students = new ArrayList<>();
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]), data[3]));
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return students;
    }
}