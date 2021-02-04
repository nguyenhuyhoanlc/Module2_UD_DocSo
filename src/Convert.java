
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double VND;
        double USD;
        byte chosse;
        do {
            System.out.println("----- Chuyển đổi tiền tệ -----");
            System.out.println("1. Chuyển đổi từ VNĐ sang USD");
            System.out.println("2. Chuyển đổi vừ USD sang VNĐ");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời nhập lựa chọn");
            chosse = scanner.nextByte();
            switch (chosse){
                case 1:
                    System.out.println("Nhập số tiền VNĐ: ");
                    VND = scanner.nextDouble();
                    double total = VND / 23000;
                    System.out.println("Số tiền VNĐ là: " + total);
                    break;
                case 2:
                    System.out.println("Nhập số tiền USD: ");
                    USD = scanner.nextDouble();
                    double total1 = USD * 23000;
                    System.out.println("Số tiền USD là: " + total1);
                    break;
            }
        }while (chosse != 3);
        System.out.println("Thoát chương trình");
    }
}
