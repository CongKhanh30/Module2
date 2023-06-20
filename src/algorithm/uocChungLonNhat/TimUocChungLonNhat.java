package algorithm.uocChungLonNhat;

public class TimUocChungLonNhat {
    public static int timUCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
