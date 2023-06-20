package algorithm.tongBinhPhuong;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào số x: ");
        int x = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập vào số y: ");
        int y = Integer.parseInt(scanner.nextLine());

        int result = TongBinhPhuong.square(x, y);

        System.out.println("sum of square from " + x +" to " + y + " is " + result);
    }
}