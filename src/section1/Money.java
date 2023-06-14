package section1;
import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23500;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị tiền USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;

        System.out.println("Giá trị tiền VNĐ tương ứng: " + quydoi);
    }
}
