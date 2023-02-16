package lab5;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;
import lab4.SanPham;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    ArrayList<Double> numbers = new ArrayList<>();

    public void nhap() {
        System.out.println("nhập số bạn muốn thêm vào danh sách");
        while (true) {
            Scanner sc = new Scanner(System.in);
            double num = sc.nextDouble();
            numbers.add(num);

            System.out.println("bạn có muốn nhập thêm Y/N");
            String choose = sc.next();
            if (choose.equals("N")) {
                break;
            }
        }
    }

    public void xuat() {
        for (double num : numbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Bai1 list = new Bai1();
        list.nhap();
        list.xuat();

    }

}
