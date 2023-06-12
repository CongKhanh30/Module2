package Test3;

import java.util.Scanner;

public class ConvertCelsius {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double fahrenheit;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Nhập vào độ F: ");
                    fahrenheit = input.nextDouble();
                    System.out.println("Độ F chuyển sang độ C: " + fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.println("Nhập vào độ C: ");
                    celsius = input.nextDouble();
                    System.out.println("Độ C chuyển sang độ F: " + celsiusToFahrenheit(celsius));
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);


    }
}
