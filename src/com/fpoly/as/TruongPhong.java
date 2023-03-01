package com.fpoly.as;

import java.util.Scanner;

public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;

    public TruongPhong() {
    }

    public TruongPhong(String ma, String hoTen, double luong, double luongTrachNhiem) {
        super(ma, hoTen, luong);

        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public void nhap(Scanner sn) {
        super.nhap(sn);
        System.out.println("Luong Trach Nhiem: ");
        luongTrachNhiem = sn.nextDouble();
        sn.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("-Luong trach nhiem: %f\n", luongTrachNhiem);
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return getLuong() + luongTrachNhiem;
    }

}
