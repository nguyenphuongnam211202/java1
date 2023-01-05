package lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập các hệ số của phương trình a*x^2 + bx + c = 0 ");
        System.out.print("nhập a : ");
        float a = sc.nextFloat();
        System.out.print("nhập b : ");
        float b = sc.nextFloat();
        System.out.print("nhập c : ");
        float c = sc.nextFloat();
        double delta = Math.pow(b,2) - 4*a*c;
        System.out.println("deltal của phương trình = " + delta);
        System.out.println(" căn deltal = " + Math.sqrt(delta));

    }
}
