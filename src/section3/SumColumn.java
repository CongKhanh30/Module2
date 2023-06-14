package section3;

import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        double[][] arr = {
                {1,2,3,4},
                {4,5,6},
                {7,8,9}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập cột muốn tính tổng: ");
        int column = sc.nextInt();
        double sum = getSum(arr, column);
        System.out.printf("Tổng cột thứ %d là: %.2f", column, sum);
    }

    public static double getSum(double[][] arr, int column){
        double sum = 0;
        for(int i = 0; i< arr.length; i++){
            if(column < arr[i].length) {
                sum += arr[i][column];
            }
        }
        return sum;
    }
}