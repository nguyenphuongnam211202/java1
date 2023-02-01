package demo;

import java.util.Scanner;

public class DeMo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so = sc.nextInt();
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<=so);
        for (int j = 0; j <= so; j++) {
            System.out.println(j);
        }
    }
}
