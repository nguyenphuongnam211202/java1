package assigment;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double hueHong;

    public TiepThi(double doanhSo, double hueHong) {
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }

    public TiepThi(String maNhanVien, String hoTen, double luong, double doanhSo, double hueHong) {
        super(maNhanVien, hoTen, luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
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
        return this.doanhSo + this.hueHong + super.getLuong();
    }

    @Override
    public String xuatThongTin() {
        return super.xuatThongTin() +
                "doanhSo=" + doanhSo +
                ", hueHong=" + hueHong +
                '}';
    }


    @Override
    public double getThueThuNhap() {
        if (getThuNhap() < 9000000) {
            return 0;
        } else if (getThuNhap() <= 15000000) {
            return getThuNhap() * 0.1;
        } else {
            return getThuNhap() * 0.12;
        }
    }
}

