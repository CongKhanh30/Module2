package Test;
import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tháng (1-12): ");
        int month = scanner.nextInt();

        int days;

        switch (month) {
            case 1: // Tháng 1
            case 3: // Tháng 3
            case 5: // Tháng 5
            case 7: // Tháng 7
            case 8: // Tháng 8
            case 10: // Tháng 10
            case 12: // Tháng 12
                days = 31;
                break;
            case 2: // Tháng 2
                days = 28;
                break;
            default: // Các tháng còn lại (4, 6, 9, 11)
                days = 30;
                break;
        }

        System.out.println("Số ngày trong tháng " + month + " là: " + days);
    }
}
