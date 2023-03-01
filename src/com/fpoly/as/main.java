package com.fpoly.as;

import java.util.Scanner;

public class main {

    public static void main(String arg[]) {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        Scanner sn = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("----------------------------Menu----------------------------");
                System.out.println("1. Nhap danh sach nhan vien tu ban phim");
                System.out.println("2. Xuat danh sach nhan vien tu ban phim");
                System.out.println("3. Tim va hien thi nhan vien theo ma nhap tu ban phim");
                System.out.println("4. Xoa nhan vien theo ma nhap tu ban phim");
                System.out.println("5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
                System.out.println("6. Tim cac nhan vien theo khoang luong nhap tu ban phim");
                System.out.println("7. Sap xep nhan vien theo ho va ten");
                System.out.println("8. Sap xep nhan vien theo thu nhap");
                System.out.println("9. Xuat 5 nhan vien co thu nhap cao nhat            ");
                System.out.println("10. Ket Thuc");
                System.out.println("------------------------------------------------------------");
                System.out.println("Moi ban chon chuc nang: ");
                int chon = sn.nextInt();
                sn.nextLine();

                if (chon == 0) {
                    System.exit(0);
                }

                switch (chon) {
                    case 1:
                        System.out.println("Chuc nang 1:  Nhap danh sach nhan vien tu ban phim  ");
                        ds.nhap();
                        break;
                    case 2:
                        System.out.println("Chuc nang 2: Xuat danh sach nhan vien tu ban phim  ");
                        ds.xuat();
                        break;
                    case 3:
                        System.out.println("Chuc nang 3: Tim va hien thi nhan vien theo ma nhap tu ban phim ");
                        ds.timVaHienThiTheoMa(sn);
                        break;
                    case 4:
                        System.out.println("Chuc nang 4: Xoa nhan vien theo ma nhap tu ban phim  ");
                        ds.xoaNhanVientheoMa(sn);
                        break;
                    case 5:
                        System.out.println("Chuc nang 5: Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
                        ds.capNhatTheoMa(sn);
                        break;
                    case 6:
                        System.out.println("Chuc nang 6: Tim cac nhan vien theo khoang luong nhap tu ban phim");
                        ds.timNhanVienTheoKhoangLuong(sn);
                        break;
                    case 7:
                        System.out.println("Chuc nang 7: Sap xep nhan vien theo ho va ten ");
                        ds.sapXepTheoTen();
                        break;
                    case 8:
                        System.out.println("Chuc nang 8: Sap xep nhan vien theo thu nhap ");
                        ds.sapXepTheoThuNhap();
                        break;
                    case 9:
                        System.out.println("Chuc nang 9: Xuat 5 nhan vien co thu nhap cao nhat");
                        ds.xuatTop5NhanVien();
                        break;
                    case 10:
                        System.out.println("Ket thuc chuong trinh!");
                        System.exit(0);
                        break;
                    default:
                        System.err.println("Vui long nhap tu 1 - 10!");
                        break;
                }
                System.out.println("Nhan Enter de tiep tuc");
                sn.nextLine();
            }
        } catch (Exception ex) {
            System.out.print("Vui long nhap so!\n");
        }

    }
}
