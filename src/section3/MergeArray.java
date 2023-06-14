package section3;

import java.util.Arrays;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};
        int[] newArr = mergeArr(arr1, arr2);
        System.out.println("Mảng thứ nhất: " + Arrays.toString(arr1));
        System.out.println("Mảng thứ hai: " + Arrays.toString(arr2));
        System.out.println("Mảng mới sau khi gộp mảng 1 và mảng 2 là: " + Arrays.toString(newArr));
    }

    public static int[] mergeArr(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < newArr.length; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - arr1.length];
            }
        }
        return newArr;
    }
}