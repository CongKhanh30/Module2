package algorithm.countTriplets;

public class CountTriplets {
    public static void main(String[] args) {
        int N = 2500;
        int S = 1000;
        int count = 0;

        for (int X = 0; X <= N; X++) {
            for (int Y = 0; Y <= N ; Y++) {
                for (int Z = 0; Z <= N ; Z++) {
                    if (X+Y+Z == S){
                        count++;
                    }
                }

            }

        }
        System.out.print(count);
    }
}
