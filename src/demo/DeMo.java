package demo;

import java.util.Scanner;

public class DeMo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập tiền lương và thưởng : ");
        float salary = sc.nextFloat();
        if(salary < 9000000){
            System.out.println("không đóng thuế");
        } else if (salary <= 15000000) {
            System.out.println("thuế = " + 0.1*salary);
        } else if (salary <= 30000000) {
            System.out.println("thuế = " + 0.15*salary);
        }else {
            System.out.println("thuế = " + 0.2*salary);
        }

    }
}
