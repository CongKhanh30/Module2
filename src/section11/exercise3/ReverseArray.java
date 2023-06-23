package section11.exercise3;

import java.util.Stack;

public class ReverseArray {
    public static int[] reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            stack.push(num);
        }

        int[] reversedArr = new int[arr.length];
        int i = 0;

        while (!stack.isEmpty()) {
            reversedArr[i] = stack.pop();
            i++;
        }

        return reversedArr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] reversedArr = reverseArray(arr);

        for (int num : reversedArr) {
            System.out.print(num + " ");
        }
    }
}