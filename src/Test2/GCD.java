package Test2;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextInt();
        System.out.println("Enter b: ");
        b = input.nextInt();
        a = Math.abs(a);
//      Gia tri tuyet doi cua a,b
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung lớn nhất");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}