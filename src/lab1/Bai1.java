package lab1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("nhập họ và tên");
        String hoTen = sc.nextLine();
        double diemTB = sc.nextDouble();
        System.out.println("họ và tên :" + hoTen + " điểm: " + diemTB);
    }
}

