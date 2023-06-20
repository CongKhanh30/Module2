package algorithm.findMax;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số thứ hai: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số thứ ba: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        int max = number1;

        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }

        System.out.print("Số lớn nhất trong 3 số là: " + max);
    }
}

