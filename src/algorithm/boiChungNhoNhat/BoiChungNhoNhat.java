package algorithm.boiChungNhoNhat;

import java.util.Scanner;

public class BoiChungNhoNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số b: ");
        b = Integer.parseInt(scanner.nextLine());

        int result = TimBoiChungNhoNhat.timBCNN(a, b);
        System.out.println("Bội chung nhỏ nhất của " + a + " và " + b + " là: " + result);
    }
}