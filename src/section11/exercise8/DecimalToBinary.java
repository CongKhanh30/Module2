package section11.exercise8;

import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int number = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        while (number / 2 != 0) {
            stack.push(number % 2);
            number /= 2;
            if (number / 2 == 0) stack.push(1);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}