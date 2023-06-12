package Test3;

public class FindMin {
    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = {9, 2, 3, 4, 1, 2, 1, 7, 8};
        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong mảng là: " + arr[index]);
    }
}
