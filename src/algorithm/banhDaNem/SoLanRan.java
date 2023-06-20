package algorithm.banhDaNem;

public class SoLanRan {
    public static int soLan(int N) {
        if (N >= 1 && N <= 9) {
            System.out.print("Cần rán 1 lần.");
        } else if (N > 9) {
            int i = N / 9;
            if (N % 9 == 0) {
                System.out.print("Cần rán số lần là: " + i);
            } else if (N % 9 != 0) {
                System.out.print("Cần rán số lần là: " + (i + 1));
            }
        }
        return N;
    }
}
