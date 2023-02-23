package lab6;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        ArrayList<SanPham> danhSachSanPham = new ArrayList<SanPham>();

        // Nhập thông tin 5 sản phẩm
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            SanPham sanPham = new SanPham();
            System.out.println("Nhap thong tin san pham thu " + (i+1) + ":");
            sanPham.nhap();
            danhSachSanPham.add(sanPham);
        }

        // In thông tin các sản phẩm của hãng Nokia
        System.out.println("Cac san pham cua hang Nokia:");
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getHang().equals("Nokia")) {
                sanPham.xuat();
            }
        }
    }
}

class SanPham {
    private String tenSp;
    private double donGia;
    private String hang;

    public SanPham() {}

    public SanPham(String tenSp, double donGia, String hang) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.hang = hang;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        tenSp = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Nhap hang: ");
        hang = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
        System.out.println("-----------------------------");
    }
}
