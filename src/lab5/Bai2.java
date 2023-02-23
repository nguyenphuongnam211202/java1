package lab5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Nhập danh sách họ tên");
            System.out.println("2. Xuất danh sách vừa nhập");
            System.out.println("3. Xuất danh sách ngẫu nhiên");
            System.out.println("4. Sắp xếp giảm dần và xuất danh sách");
            System.out.println("5. Tìm và xóa họ tên nhập từ bàn phím");
            System.out.println("6. Kết thúc");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc kí tự Enter sau khi nhập số
            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng họ tên: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Đọc kí tự Enter sau khi nhập số
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhập họ tên thứ " + (i + 1) + ": ");
                        String name = scanner.nextLine();
                        nameList.add(name);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách họ tên:");
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 3:
                    System.out.println("Danh sách ngẫu nhiên:");
                    Collections.shuffle(nameList);
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 4:
                    System.out.println("Danh sách sắp xếp giảm dần:");
                    Collections.sort(nameList, Collections.reverseOrder());
                    for (String name : nameList) {
                        System.out.println(name);
                    }
                    break;
                case 5:
                    System.out.print("Nhập họ tên cần xóa: ");
                    String nameToDelete = scanner.nextLine();
                    boolean isDeleted = nameList.remove(nameToDelete);
                    if (isDeleted) {
                        System.out.println("Đã xóa họ tên \"" + nameToDelete + "\"");
                    } else {
                        System.out.println("Không tìm thấy họ tên \"" + nameToDelete + "\" trong danh sách");
                    }
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình.");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ.");
                    break;
            }
        } while (choice != 6);
    }
}