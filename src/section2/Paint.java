package section2;

import java.util.Scanner;

public class Paint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("---------MENU---------");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle");
            System.out.println("3.Exit");

            System.out.println("Hãy lựa chọn: ");
            choice = sc.nextInt();
            if (choice == 1) {
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.printf("%-2s", "*");
                    }
                    System.out.println();
                }
            } else if (choice == 2) {
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%-2s", "*");
                    }
                    System.out.println();
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Lựa chọn không đúng");
            }
            sc.nextLine();
            System.out.println("Nhấn Enter để tiếp tục");
            sc.nextLine();
        }
    }
}