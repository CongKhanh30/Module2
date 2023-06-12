package Section2;

import static Section2.TwentyPrime.isPrime;

public class Prime1 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100 ; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}