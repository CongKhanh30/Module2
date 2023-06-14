package section4.QE;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Đây là phương trình bậc 1");
        } else {
            QuadraticEquation qua = new QuadraticEquation(a, b, c);
            if (qua.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (qua.getDiscriminant() == 0) {
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + qua.getRoot1());
            } else {
                System.out.printf("Phương trình có 2 nghiệm x1 = %.3f và x2 = %.3f", qua.getRoot1(), qua.getRoot2());
            }
        }
    }
}
