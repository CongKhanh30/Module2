package algorithm.banhDaNem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào số bánh đa nem N: ");
        int N = Integer.parseInt(scanner.nextLine());

        SoLanRan.soLan(N);
    }
}
