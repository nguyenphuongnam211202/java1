package lab3;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số cần kiểm tra");
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < num; i++) {
            if(num%i ==0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println(num + " là số nguyên tố");
        }else {
            System.out.println(num + " không phải là số nguyên tố ");
        }
    }
}
