package section13.exercise4;

public class Main {
    public static void main(String[] args) {
        int[] list = {0, 2, 5, 7, 8, 9};
        System.out.println(binarySearch(list, 0, list.length - 1, 7));
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == value) return middle;
        else if (array[middle] > value) {
            right = middle - 1;
        } else {
            left = middle + 1;
        }
        return binarySearch(array, left, right, value);
    }
}