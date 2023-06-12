package Section3;

import java.util.Scanner;
import java.util.Arrays;

public class DeleteSection {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        int index = input.nextInt();
        int newArr[] = delSection(arr, index);
        System.out.println("Mảng ban đầu là:" + Arrays.toString(arr));
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArr));
    }

    public static int[] delSection(int[] arr, int index) {
        if (index < 0 || index > arr.length) {
            return arr;
        }
        int newArr[] = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else {
                newArr[i] = arr[i + 1];
            }
        }
        return newArr;
    }
}
