package onTap;

import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    static ArrayList<Double> so = new ArrayList<>();

    static void nhap(int n) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Hay nhap so thu " + i);
            double s = sc.nextDouble();
            so.add(s);
        }
    }

    static void xuat() {
        System.out.println("Chieu dai: " + so.size());
        for (double e : so) {
            System.out.println(e);
        }
    }

    static double tinhTong() {
        double t = 0;
        for (Double e : so) {
            t = t + e;
        }
        return t;
    }

    static double tongLe() {
        double t = 0;
        for (Double e : so) {
            t = 0;
            if (e % 2 != 0) {
                t = t + e;
            }
        }
        return t;
    }

    public static void main(String[] args) {
        Bai1.nhap(4);
        Bai1.xuat();
        System.out.println("Tong la: " + tinhTong());
        System.out.println("Tong le la: " + tongLe());

    }
}
