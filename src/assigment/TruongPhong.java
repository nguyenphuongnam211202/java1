package assigment;

public class TruongPhong extends NhanVien{

    private double luongTrachNhiem;


    public TruongPhong(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public TruongPhong(String maNhanVien, String hoTen, double luong, double luongTrachNhiem) {
        super(maNhanVien, hoTen, luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        return this.luongTrachNhiem + super.getLuong() ;
    }

    @Override
    public String xuatThongTin() {
        return super.xuatThongTin() +
                "luongTrachNhiem=" + luongTrachNhiem +
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
