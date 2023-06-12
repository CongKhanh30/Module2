package Section3;

import java.util.Scanner;
import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập phần tử cần thêm vào mảng: ");
        int num = input.nextInt();
        System.out.println("Nhập vị trí muốn thêm vào mảng: ");
        int index = input.nextInt();
        int newArr[] = add(arr, num, index);
        System.out.println("Mảng ban đầu là:" + Arrays.toString(arr));
        System.out.println("Mảng sau khi thêm phần tử là: " + Arrays.toString(newArr));
    }

    public static int[] add(int[] arr,int num, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("Không chèn được phần tử vào mảng.");
        }
        int newArr[] = new int[arr.length + 1];
        newArr[index] = num;
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if(i > index) {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}