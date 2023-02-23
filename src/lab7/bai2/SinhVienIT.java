package lab7.bai2;

public class SinhVienIT extends SinhVienPoly {
    private double diemJava;
    private double diemHTML;
    private double diemCSS;

    public SinhVienIT(String hoTen, String nganh, double diemJava, double diemHTML, double diemCSS) {
        super(hoTen, nganh);
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }

    @Override
    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
}

