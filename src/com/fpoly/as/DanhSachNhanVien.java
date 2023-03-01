package com.fpoly.as;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DanhSachNhanVien {
    private final  ArrayList<NhanVien> list = new ArrayList<>();
    public void nhap(){
        Scanner sn = new Scanner(System.in);
       // list.clear();
        do {
            System.out.println("Nhap loai nhan vien:\n1.Hanh Chinh\n2.Truong Phong\n3.Tiep Thi\n4.tro ve menu chính\n----------------- ");
            String loai = sn.nextLine();
            if(loai ==null || loai.equals(""))
                break;
            int nloai = Integer.parseInt(loai);
            switch(nloai){
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(sn);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(sn);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(sn);
                    list.add(nvtt);
                    break;
                case 4 :
                    return;
            }
        } while (true);  
    }
    public void xuat(){
        System.out.println("Danh Sach Nhan Vien: ");
        for (NhanVien nv : list) {
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh)nv).xuat();
            }else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)nv).xuat();
        }else if (nv instanceof TruongPhong) {
                ((TruongPhong)nv).xuat();
    }         
}
    }
    
    public void xoaNhanVientheoMa(Scanner sn){
        System.out.println("Xoa thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma = sn.nextLine();
         NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
            if (tim != null) {
                list.remove(tim);
                System.out.println("Da xoa nhan vien");
         
            }else{
                System.out.printf("Khong tim thay nhan vien co ma %s\n ", ma);
            }
    }
      public void xuatTop5NhanVien(){
        sapXepTheoThuNhap();
        int t = (list.size()<5)?list.size():5;
        for (int i = 0; i < t; i++) {
            list.get(i).xuat();
        }
    }
    public void timVaHienThiTheoMa(Scanner sn){
        System.out.println("Nhap ma can tim: ");
        String ma = sn.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
            if (tim != null) {
                System.out.println("Thong tin nhan vien tim thay theo ma: ");
                tim.xuat();
            }else{
                System.out.printf("Khong tim thay nhan vien co ma: \n",ma);
            }
    }
    public void capNhatTheoMa(Scanner sn){
        System.out.println("cap nhat thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can cap nhat thong tin: ");
        String ma = sn.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                tim = nv;
                break;
            }
        }
        if (tim != null) {
            System.out.println("Nhap thong tin moi cho nhan vien can cap nhat: ");
            if (tim instanceof NhanVienHanhChinh) {
               ((NhanVienHanhChinh)tim).nhap(sn);
            }else  if (tim instanceof TruongPhong) {
                ((TruongPhong)tim).nhap(sn);
        }else if (tim instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)tim).nhap(sn);
        }
    }else{
            System.out.printf("khong tim thay ma nhan vien: ", ma);
        }
}
    
    public void sapXepTheoTen(){
       Collections.sort(list);
        for (NhanVien nv : list) {
            System.out.println();
        }
    }
    public void sapXepTheoThuNhap(){
       Comparator <NhanVien> haizz = new Comparator<NhanVien>(){

           @Override
           public int compare(NhanVien o1, NhanVien o2) {
               int s= 0;
               double tn1 = o1.getThuNhap(), tn2 = o2.getThuNhap();
               if (tn1>tn2) s=-1;
               else if(tn1<tn2) s=1;
               return s;
           }
        };
        Collections.sort(list, haizz);
    }
  
    
    public void timNhanVienTheoKhoangLuong(Scanner sn){
        System.out.println("Tim nhan vien theo khoang luong");
        System.out.print("Nhap khoang luong thap nhat: ");
        double min = sn.nextDouble();
        
        System.out.println("Nhap khoang luong cao nhat: ");
        double max = sn.nextDouble();
        boolean tim = false;
        for (NhanVien nhanVien : list) {
            if (min <= nhanVien.getLuong()  &&  nhanVien.getLuong() <= max){
                nhanVien.xuat();
                System.out.println();
                tim = true;
            }
        }
        if (tim = false){
            System.out.println("Khong co nhan vien nao co luong trong khoang can tim");}
    }
    
}
