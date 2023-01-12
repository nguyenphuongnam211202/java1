package lab2;

import java.util.Scanner;

public class Bai4 {
    public static float chieuCao = 0.0f;
    public static float canNang = 0.0f;
    public static String meNu() {
        return "\t+--------------------------------+\n" +
                "\t1.giải phương trình bậc nhất\n" +
                "\t2.giải phương trình bậc hai\n " +
                "\t3.Tính tiền điện\n" +
                "\t4.tính chỉ số BMI\n" +
                "\t5.exit"
                ;
    }

    public static void giaiPTB1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình : ax + b = 0");
        System.out.println("nhập hệ số a");
        float a = sc.nextFloat();
        System.out.println("nhập hệ số b");
        float b = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("phương trình có vô số nghiệm");
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        } else {
            System.out.println("phương trình có nghiệm x = " + -b / a);
        }
    }

    public static void giaiPTB2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("phương trình ax^2 + bx + c = 0 ");
        System.out.println("nhập hệ số a ");
        float a = sc.nextFloat();
        System.out.println("nhập hệ số b");
        float b = sc.nextFloat();
        System.out.println("nhập hệ số c");
        float c = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình có vô số nghiệm");
                } else {
                    System.out.println("phương trình vô nghiệm");
                }
            } else {
                System.out.println("phương trình có một nghiệm x = " + -c / b);
            }
        } else {
            double detal = Math.pow(b, 2) - 4 * a * c;
            if (detal > 0) {
                System.out.println("phương trình có 2 nghiệm :\n"
                        + " x1 = " + (-b + Math.sqrt(detal)) / (2 * a) + " \n"
                        + " x2 = " + (-b - Math.sqrt(detal)) / (2 * a));
            } else if (detal == 0) {
                System.out.println("phương trình có một nghiệm kép x = " + (-b) / (2 * a));
            } else {
                System.out.println("phương trình vô nghiệm");
            }
        }
    }

    public static void tinhTienDien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số điện tiêu thụ của tháng");
        int electricNum = 0;
        do {
            electricNum = sc.nextInt();
        } while (electricNum <= 0);
        if (electricNum <= 50) {
            float sumMoney = electricNum * 1000;
            System.out.println("tổng tiền điện là : " + sumMoney + " VNĐ");
        } else {
            float sumMoney = 50 * 1000 + (electricNum - 50) * 1200;
            System.out.println("tổng tiền điện là :" + sumMoney + " VNĐ");
        }
    }

    public static void chiSoBMI(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao (m)");
        chieuCao = sc.nextFloat();
        System.out.println("nhập cân nặng (kg)");
        canNang = sc.nextFloat();
        double bmi = (canNang) / (chieuCao * chieuCao);
        System.out.println("chỉ số BMI = " + bmi);
        if (bmi < 18.5){
            System.out.println("nhẹ cân");
        } else if (bmi < 25 ) {
            System.out.println("cân nặng bình thường");
        } else if (bmi<30){
            System.out.println("thừa cân nhẹ");
        }else if (bmi < 35) {
            System.out.println("thừa cân nặng");
        } else {
            System.out.println("béo phì");
        }
    }

    public static void main(String[] args) {
        System.out.println(meNu());
        System.out.println("nhập lựa chọn của bạn : ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1 :
                giaiPTB1();
                break;
            case 2 :
                giaiPTB2();
                break;
            case 3:
                tinhTienDien();
            case 4:
                chiSoBMI();
                break;
            case 5 :
                break;
            default:
                System.out.println("vui lòng nhập đúng");
        }
    }
}


