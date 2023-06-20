package algorithm.uocChungLonNhat;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số a: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào số b: ");
        b = Integer.parseInt(scanner.nextLine());

        int result = TimUocChungLonNhat.timUCLN(a, b);
        System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là: " + result);
    }


}

