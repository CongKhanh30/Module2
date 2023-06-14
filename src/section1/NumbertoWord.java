package section1;
import java.util.Scanner;

public class NumbertoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên không âm có tối đa 3 chữ số:");
        int number = sc.nextInt();
        int donVi = number % 10;
        int chuc = (number / 10) % 10;
        int tram = number / 100;
        String chuoiTram, chuoiChuc, chuoiDonVi;
        if(tram == 0) {
            chuoiTram = "";
        } else {
            chuoiTram = docChuoi(tram) + " trăm ";
        }

        if(chuc == 0){
            chuoiChuc = "linh ";
        } else if(chuc == 1) {
            chuoiChuc = "mười ";
        } else{
            chuoiChuc = docChuoi(chuc) + " mươi ";
        }

        if(donVi == 0){
            chuoiDonVi = "";
        } else {
            chuoiDonVi = docChuoi(donVi);
        }

        System.out.println(chuoiTram + chuoiChuc + chuoiDonVi);
    }
    public static String docChuoi(int number){
        String chuoi = "";
        switch (number) {
            case 1:
                chuoi = "một";
                break;
            case 2:
                chuoi = "hai";
                break;
            case 3:
                chuoi = "ba";
                break;
            case 4:
                chuoi = "bốn";
                break;
            case 5:
                chuoi = "năm";
                break;
            case 6:
                chuoi = "sáu";
                break;
            case 7:
                chuoi = "bảy";
                break;
            case 8:
                chuoi = "tám";
                break;
            case 9:
                chuoi = "chín";
                break;
            case 10:
                chuoi = "mười";
                break;
        }
        return chuoi;
    }
}
