package algorithm.tongBinhPhuong;

public class TongBinhPhuong {

    public static int square(int x, int y) {
        int sum = 0;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                sum += i * i;
            }
        } else {
            for (int i = y; i <= x; i++) {
                sum += i * i;
            }
        }
        return sum;

    }
}
