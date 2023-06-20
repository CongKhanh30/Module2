package algorithm.perfectSquare;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập giá trị b: ");
        int b = Integer.parseInt(scanner.nextLine());

        System.out.println("Các số chính phương từ " + a + " đến " + b + " là:");
        for (int i = a; i <= b; i++) {
            if (isPerfectSquare(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }
}

