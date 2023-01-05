package lab1;

import java.util.Scanner;

public class Bonus {
    public static float chieuCao = 0.0f;
    public static float canNang = 0.0f;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao (m)");
        chieuCao = sc.nextFloat();
        System.out.println("nhập cân nặng (kg)");
        canNang = sc.nextFloat();
        double bmi = (canNang)/(chieuCao*chieuCao);
        System.out.println("chỉ số BMI = " + bmi);

    }
}
