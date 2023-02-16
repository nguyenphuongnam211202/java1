package assigment;

public abstract class NhanVien {
    private String maNhanVien;
    private String hoTen;
    private double luong;

    public NhanVien(){}

    public NhanVien(String maNhanVien, String hoTen, double luong) {
        this.maNhanVien = maNhanVien;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
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

    public String xuatThongTin() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", luong=" + luong ;
    }

    public abstract double getThuNhap();
    public abstract double getThueThuNhap();
}
