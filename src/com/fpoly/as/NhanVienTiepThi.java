package com.fpoly.as;

import java.util.Scanner;
//Public: Có thành phần công khai và có thể truy cập tự do từ bên ngoài
public class NhanVienTiepThi extends NhanVien {
    //Private: Chỉ được truy cập trong nội bộ lớp
    private double hueHong;
    private double doanhSo;

    public NhanVienTiepThi() {
    }

    public NhanVienTiepThi(double doanhSo, double hueHong, String ma, String hoTen, double luong) {
        super(ma, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
//@Override: Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha
    @Override
    public void nhap(Scanner sn) {
        //super trong java là một biến tham chiếu được sử dụng để tham chiếu trực tiếp đến đối tượng của lớp cha gần nhất
        super.nhap(sn);
        System.out.print("Doanh So: ");
        doanhSo = sn.nextDouble();
        System.out.print("Hue Hong: ");
        hueHong = sn.nextDouble();
        sn.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();

        System.out.printf("-Doanh so: %f - Hue Hong: %f\n", doanhSo, hueHong);
    }

    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHueHong() {
        return hueHong;
    }

    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }

    @Override
    public double getThuNhap() {
        return luong + doanhSo * hueHong / 100;
    }

}
