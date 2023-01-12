package lab2;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình : ax + b = 0");
        System.out.println("nhập hệ số a");
        float a = sc.nextFloat();
        System.out.println("nhập hệ số b");
        float b = sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.println("phương trình có vô số nghiệm");
            }else {
                System.out.println("phương trình vô nghiệm");
            }
        }else {
            System.out.println("phương trình có nghiệm x = " + -b/a );
        }
    }
}
