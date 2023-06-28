package section14.exercise4;

public class InsertionSort {
    static double[] list = {1, 9, 4.5, 10, 5.7, -4.5, 0, 4.5};

    public static void insertionSort(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double currentValue = list[i];
            int currentIndex = i;

            while (currentIndex > 0 && currentValue < list[currentIndex-1]){
                list[currentIndex] = list[currentIndex-1];
                currentIndex--;
            }
            list[currentIndex] = currentValue;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (double v : list) System.out.print(v + " ");
    }
}