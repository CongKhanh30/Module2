package Section3;

public class FindMax2 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,100,6},
                {7,8,7}
        };
        int max = findMax(arr);
        System.out.println("Giá trị lớn nhất của mảng arr là: " + max);
    }
    public static int findMax(int[][] arr){
        int max = arr[0][0];
        for(int[] i : arr){
            for(int j : i){
                if(j > max){
                    max = j;
                }
            }
        }
        return max;
    }
}