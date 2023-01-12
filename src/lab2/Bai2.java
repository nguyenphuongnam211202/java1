package lab2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình ax^2 + bx + c = 0 ");
        System.out.println("nhập hệ số a ");
        float a = sc.nextFloat();
        System.out.println("nhập hệ số b");
        float b = sc.nextFloat();
        System.out.println("nhập hệ số c");
        float c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình có vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                System.out.println("phương trình có một nghiệm x = " + -c / b);
            }
        } else {
            double detal = Math.pow(b, 2) - 4 * a * c;
            if (detal > 0) {
                System.out.println("phương trình có 2 nghiệm :\n"
                        + " x1 = " + (-b + Math.sqrt(detal)) / (2 * a) + " \n"
                        + " x2 = " + (-b - Math.sqrt(detal)) / (2 * a));
            } else if (detal == 0) {
                System.out.println("phương trình có một nghiệm kép x = " + (-b  / (2 * a) ));
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }
}
