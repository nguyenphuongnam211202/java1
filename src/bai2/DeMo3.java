package bai2;

import java.util.Scanner;

public class DeMo3 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 0;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("nhập phép tính");
        String choose = sc.nextLine();
        switch(choose){
            case "+" :
                c = a + b;
                break;
            case "-" :
                c = a - b;
                break;
            case "*":
                c = a *b;
            case "/" :
                c = a/b;
                break;
            default:
                System.out.println("mời nhập đúng");
        }
        System.out.println(c);
    }
}
