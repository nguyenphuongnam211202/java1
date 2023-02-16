package lab4;

import java.util.Scanner;

public class SanPham {
    private String tenSp;
    private double donGia;
    private double giamGia;

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

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham(){
    }

    public SanPham(String tenSp, double donGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
    }

    public SanPham(String tenSp, double donGia, double giamGia) {
        this.tenSp = tenSp;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public double getThueNhapKhau(){
        return donGia*0.1;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sản phẩm");
        tenSp = sc.nextLine();
        System.out.println("nhập đơn gía");
        donGia = sc.nextDouble();
        System.out.println("nhập giam gía");
        giamGia = sc.nextDouble();
    }

    public void xuat(){
        System.out.println("SanPham{" +
                "tenSp='" + tenSp + '\'' +
                ", donGia=" + donGia +
                ", giamGia=" + giamGia +
                ", thueNhapKhau =" + getThueNhapKhau() +
                '}');
    }
}
