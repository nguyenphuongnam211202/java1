package lab2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số điện tiêu thụ của tháng");
        int electricNum = 0;
        do {
            electricNum = sc.nextInt();
        }while (electricNum <=0 );
        if(electricNum<=50){
            float sumMoney = electricNum*1000;
            System.out.println("tổng tiền điện là : " + sumMoney);
        }else {
            float sumMoney = 50*1000 + (electricNum-50)*1200;
            System.out.println("tổng tiền điện là :" + sumMoney);
        }
    }
}
