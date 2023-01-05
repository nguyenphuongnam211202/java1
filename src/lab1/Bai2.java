package lab1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài");
        float chieuDai = sc.nextFloat();
        System.out.println("nhập chiều rộng");
        float chieuRong = sc.nextFloat();
        System.out.println("chu vi hình chữ nhật là: " + (chieuDai+chieuRong)*2);
        System.out.println("Diện tích hình chữ nhật là: " + (chieuDai*chieuRong));
        System.out.println("cạnh nhỏ nhất là: " + Math.min(chieuRong,chieuDai));
    }
}
