package section11.exercise9;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi kiểm tra: ");
        String str = sc.nextLine();
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i)).toLowerCase();
            stack.push(ch);
            queue.add(ch);
        }
        boolean isCheck = true;
        while (!stack.isEmpty()){
            if(!stack.pop().equals(queue.poll())){
                isCheck = false;
                break;
            }
        }
        if (isCheck)
            System.out.println("Đây là chuỗi Palindrome");
        else
            System.out.println("Đây không là chuỗi Palindrome");
    }
}