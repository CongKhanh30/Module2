package algorithm.banhChung;

import java.util.Arrays;
import java.util.Scanner;

public class BanhChung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng nhóm: ");
        int soNhom = scanner.nextInt();

        int[] soThanhVien = new int[soNhom];

        System.out.println("Nhập số thành viên của từng nhóm: ");
        for (int i = 0; i < soNhom; i++) {
            soThanhVien[i] = scanner.nextInt();
        }

        Arrays.sort(soThanhVien);

        int soBanhChungCanThiet = 0;
        int i = 0;
        int j = soNhom - 1;

        while (i <= j) {
            if (soThanhVien[i] + soThanhVien[j] <= 4) {
                i++;
                j--;
            } else {
                j--;
            }
            soBanhChungCanThiet++;
        }

        System.out.println("Số bánh chưng cần thiết là: " + soBanhChungCanThiet);
    }
}