package onTap;


import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào số thứ nhất ");
        int num1 = sc.nextInt();
        System.out.println("nhập vào số thứ hai");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println(num1);
        }else if(num1<num2){
            System.out.println(num2);
        }else{
            System.out.println("so thu nhat = so thu hai = " + num2);
        }
    }
}
