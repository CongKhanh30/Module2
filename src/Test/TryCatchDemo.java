package Test;

import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            try {
                System.out.print("Nhập một số: ");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0 && choice <= 4) {
                    break;
                } else {
                    System.out.println("Số nhập vào phải từ 0 đến 4. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Không phải số . Vui lòng nhập lại.");
            }
        }

        System.out.println("Số đã nhập: " + choice);


    }
}
