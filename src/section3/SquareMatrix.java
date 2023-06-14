package section3;

public class SquareMatrix {
    public static void main(String[] args) {
        double[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        double sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - 1 - i];
        }
        System.out.println("Tổng các số ở đường chéo chính 1 là: " + sum1);
        System.out.println("Tổng các số ở đường chéo chính 2 là: " + sum2);
    }
}