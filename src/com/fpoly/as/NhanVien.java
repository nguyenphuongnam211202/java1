package com.fpoly.as;

import java.util.Scanner;
//abstract: lớp trừu tượng
public abstract class NhanVien implements Comparable<NhanVien> {
    String ma, hoTen;
    double luong;

    public abstract double getThuNhap();

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public void nhap(Scanner sn) {

        KiemTra kt = new KiemTra();
        do {
            System.out.println("Ho ten: ");
            hoTen = sn.nextLine();
            if (kt.ktTen(hoTen)) {
                break;
            }
            System.out.println("Ho ten khong hop le! Vui long nhap lai!");
        } while (true);
        do {
            System.out.println("Ma nhan vien: ");
            ma = sn.nextLine();
            if (kt.ktMA(ma)) {
                break;
            }
            System.out.println("Ma khong hop le! Vui long nhap lai!");
        } while (true);

        System.out.println("Luong: ");
        luong = sn.nextDouble();

        sn.nextLine();
    }

    public void xuat() {
        System.out.printf("Ma: %s  | Ho ten: %s | Luong: %f | Thu nhap: %f\n", ma, hoTen, luong, getThuNhap());
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    @Override
    public int compareTo(NhanVien sn) {
        return this.hoTen.compareTo(sn.hoTen);
    }

}
