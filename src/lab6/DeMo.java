package lab6;

import java.util.Scanner;

public class DeMo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập user");
        String user = sc.nextLine();
        System.out.println("nhập pass");
        String pass = sc.nextLine();
        if(user.equalsIgnoreCase("hello") && pass.length() >6){
            System.out.println("đăng nhập thành công");
        }else {
            System.out.println("đăng nhập thất bại");
        }
    }
}
