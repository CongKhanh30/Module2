package algorithm.triangle;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh thứ nhất: ");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập cạnh thứ hai: ");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập cạnh thứ ba: ");
        double side3 = Double.parseDouble(scanner.nextLine());

        if (isTriangle(side1, side2, side3)) {
            String triangleType = getTriangleType(side1, side2, side3);
            System.out.println("Tam giác này là " + triangleType);
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
    }

    public static boolean isTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2;
    }

    public static String getTriangleType(double side1, double side2, double side3) {
        if (side1 == side2 && side2 == side3) {
            return "tam giác đều";
        } else if (side1 == side2 || side2 == side3 || side3 == side1) {
            return "tam giác cân";
        } else {
            return "tam giác thường";
        }
    }
}
