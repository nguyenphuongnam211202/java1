package lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều dài cạnh khối lập phương");
        float canh = sc.nextFloat();
        double theTich = Math.pow(canh,3);
        System.out.println("Thể tích của khối lập phương là: " + theTich);
    }
}
