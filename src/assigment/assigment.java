package assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class assigment {
    public static void main(String[] args) {
        System.out.println("\t1.Nhập và xuất danh sách nhân viên\n" +
                "\t2.Xóa nhân viên hoặc cập nhật thông tin nhân viên\n" +
                "\t3.Tìm kiếm nhân viên theo lương\n" +
                "\t4.Sắp xếp nhân viên theo họ tên và thu nhập\n" +
                "\t5.Xuất 5 nhân viên có thu nhập cao nhất công ty");
        int choose = 0;
        do {
            try {
                System.out.println("mời bạn nhập lựa chọn ");
                Scanner sc = new Scanner(System.in);
                choose = sc.nextInt();
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        } while (choose < 1 || choose > 5);
        switch (choose) {
            case 1:
                nhapXuatdanhSachNV();
                break;
            case 2:

                break;

        }
    }



    public static void nhapXuatdanhSachNV() {
        ArrayList<NhanVien> danhSach = new ArrayList<>();
        String maNhanVien;
        String hoTenNhanVien;
        double luong;
        double doanhSo;
        double hueHong;
        double luongTrachNhiem;
        System.out.println("số lượng nhân viên muốn nhập");
        Scanner sc = new Scanner(System.in);
        int soLuong = sc.nextInt();
        for (int i = 0; i < soLuong; i++) {
            System.out.println("bạn muốn nhập thông tin của tiếp thị hay trưởng phòng");
            String flag = sc.nextLine().toLowerCase();
            System.out.print("mời nhập mã nhân viên: ");
            maNhanVien = sc.nextLine();
            System.out.print("mời nhập họ tên nhân viên: ");
            hoTenNhanVien = sc.nextLine();
            System.out.print("mời nhập lương");
            luong = sc.nextDouble();
            if (flag.equals("tiếp thị")) {
                System.out.print("mời nhập doanh số: ");
                doanhSo = sc.nextDouble();
                System.out.print("mời nhập huê hồng");
                hueHong = sc.nextDouble();
                danhSach.add(new TiepThi(maNhanVien, hoTenNhanVien, luong, doanhSo, hueHong));
            } else {
                System.out.println("mời nhập lương trách nhiệm :");
                luongTrachNhiem = sc.nextDouble();
                danhSach.add(new TruongPhong(maNhanVien, hoTenNhanVien, luong, luongTrachNhiem));
            }
        }
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i).xuatThongTin());
        }
    }


}
