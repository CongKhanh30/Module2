package Test3;

import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {
        String [] students = {"Khanh", "Huỳnh", "Quang", "Đạt", "Hiếu", "Khánh", "Sơn", "Hảo", "Bách", "Tuấn"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++ ){
            if (students[i].equals(input_name)){
                System.out.println("Vị trí của học sinh: " + input_name + " trong danh sách là: " + i );
                isExist=true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Không có tên " + input_name + " danh sách");
        }
    }
}
