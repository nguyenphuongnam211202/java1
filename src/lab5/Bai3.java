package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class SanPham {
    private String ten;
    private double donGia;

    public SanPham(String ten, double donGia) {
        this.ten = ten;
        this.donGia = donGia;
    }

    public String getTen() {
        return ten;
    }

    public double getDonGia() {
        return donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ten='" + ten + '\'' +
                ", donGia=" + donGia +
                '}';
    }
}

