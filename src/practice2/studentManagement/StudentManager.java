package practice2.studentManagement;

import java.util.ArrayList;
import java.util.List;


public class StudentManager {
    private List<Student> students;
    private ReaderAndWriteStudent readerAndWriteStudent = new ReaderAndWriteStudent();

    public StudentManager() {
        students = new ArrayList<>();
        students = readerAndWriteStudent.readFile();
    }

    public void addStudent(Student student) {
        students.add(student);
        readerAndWriteStudent.writeFile(student);
    }

    public void updateStudent(int id, String fullName, int age, String homeTown) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setFullName(fullName);
                student.setAge(age);
                student.setHometown(homeTown);
                return;
            }
        }
        System.out.println("Học sinh không được tìm thấy.");
    }

    public void deleteStudent(int id) {

        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                return;
            }
        }
        System.out.println("Học sinh không được tìm thấy.");
    }

    public void searchStudent(String name) {
        boolean found = false;
        for (Student student : students) {
            if (student.getFullName().toLowerCase().contains(name.toLowerCase())) {
                student.showInformation();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy học sinh phù hợp.");
        }
    }

    public void showAll() {
        for (Student student : students) {
            student.showInformation();
            System.out.println("------------------------");
        }
        students = readerAndWriteStudent.readFile();
    }

}
