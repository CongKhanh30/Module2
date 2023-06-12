package Section3;

public class FindMin2 {
    public static void main(String[] args) {
        int[][] arr = {
                {99,4,3},
                {4,2,6},
                {7,8,7}
        };
        int min = findMin(arr);
        System.out.println("Giá trị lớn nhất của mảng arr là: " + min);
    }
    public static int findMin(int[][] arr){
        int min = arr[0][0];
        for(int[] i : arr){
            for(int j : i){
                if(j < min){
                    min = j;
                }
            }
        }
        return min;
    }
}
