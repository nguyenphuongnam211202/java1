package lab3;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("nhập n");
            n = sc.nextInt();
        } while (n < 2);
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\ntổng các số chẵn từ 2 đến " + n + " = " + sum);
    }

}
