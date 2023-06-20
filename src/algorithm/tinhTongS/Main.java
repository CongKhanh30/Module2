package algorithm.tinhTongS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị n: ");
        int n = Integer.parseInt(scanner.nextLine());

        double sum = 100.0;
        for (int i = 1; i <= n; i++) {
            sum += (double) (i * (i + 1)) / ((i + 1) * (i + 2));
        }

        System.out.println("Giá trị của biểu thức S là: " + sum);
    }
}

