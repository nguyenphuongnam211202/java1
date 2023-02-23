package lab6;


import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho va ten cua ban: ");
        String fullName = scanner.nextLine();

        // Tach ho
        String ho = fullName.substring(0, fullName.indexOf(' '));
        ho = ho.toUpperCase();

        // Tach ten
        String ten = fullName.substring(fullName.lastIndexOf(' ') + 1);
        ten = ten.toUpperCase();

        // Tach ten dem
        String tenDem = fullName.substring(fullName.indexOf(' ') + 1, fullName.lastIndexOf(' '));

        // In ho, ten, va ten dem
        System.out.println("Ho: " + ho);
        System.out.println("Ten dem: " + tenDem);
        System.out.println("Ten: " + ten);
    }
}
