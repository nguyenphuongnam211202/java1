package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    private static ArrayList<SanPham> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            System.out.println("MENU");
            System.out.println("1. Nhập danh sách sản phẩm từ bàn phím");
            System.out.println("2. Sắp xếp giảm dần theo giá và xuất ra màn hình");
            System.out.println("3. Tìm và xóa sản phẩm theo tên nhập từ bàn phím");
            System.out.println("4. Xuất giá trung bình của các sản phẩm");
            System.out.println("5. Kết thúc chương trình");
            System.out.print("Vui lòng chọn chức năng: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the remaining newline character

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    sapxep();
                    xuat();
                    break;
                case 3:
                    xoaTheoTen();
                    break;
                case 4:
                    xuatGiaTrungBinh();
                    break;
                case 5:
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
            System.out.println(); // print a blank line for better formatting
        }
    }

    private static void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String ten = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double donGia = scanner.nextDouble();
            scanner.nextLine(); // consume the remaining newline character

            SanPham sp = new SanPham(ten, donGia);
            list.add(sp);
        }
    }

    private static void xuat() {
        System.out.println("Danh sách sản phẩm:");
        for (SanPham sp : list) {
            System.out.println(sp);
        }
    }

    private static void xuatGiaTrungBinh() {
        double tongGia = 0;
        for (SanPham sp : list) {
            tongGia += sp.getDonGia();
        }
        double giaTrungBinh = tongGia / list.size();
        System.out.println("Giá trung bình của các sản phẩm là: " + giaTrungBinh);
    }

    private static void xoaTheoTen() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm cần xóa: ");
        String ten = scanner.nextLine();

        boolean isRemoved = false;
        for (SanPham sp : list) {
            if (sp.getTen().equalsIgnoreCase(ten)) {
                list.remove(sp);
                isRemoved = true;
                System.out.println("Đã xóa sản phẩm: " + sp);
                break; // xóa chỉ một sản phẩm, thoát khỏi vòng lặp
            }
        }

        if (!isRemoved) {
            System.out.println("Không tìm thấy sản phẩm có tên là " + ten);
        }
    }

    private static void sapxep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o2.getDonGia(), o1.getDonGia());
            }
        };
        Collections.sort(list, comp);
        System.out.println("Danh sách sản phẩm sau khi sắp xếp giảm dần theo giá:");
        xuat();
    }

}
