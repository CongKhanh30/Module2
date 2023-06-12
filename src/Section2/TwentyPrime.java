package Section2;

public class TwentyPrime {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; ; i++) {
            if (isPrime(i)) {
                System.out.printf("Số thứ %d là: %d\n", count, i);
                count++;
            }
            if (count > 20) break;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return number > 1;
    }
}
