package lab7;


class ChuNhat {
    protected double rong;
    protected double dai;

    public ChuNhat(double rong, double dai) {
        this.rong = rong;
        this.dai = dai;
    }

    public double getChuVi() {
        return (this.rong + this.dai) * 2;
    }

    public double getDienTich() {
        return this.rong * this.dai;
    }

    public void xuat() {
        System.out.println("Chieu rong: " + this.rong);
        System.out.println("Chieu dai: " + this.dai);
        System.out.println("Dien tich: " + this.getDienTich());
        System.out.println("Chu vi: " + this.getChuVi());
    }
}


    class Vuong extends ChuNhat {
        public Vuong(double canh) {
            super(canh, canh);
        }

        @Override
        public void xuat() {
            System.out.println("Canh: " + this.rong);
            System.out.println("Dien tich: " + this.getDienTich());
            System.out.println("Chu vi: " + this.getChuVi());
        }
    }

public class Main {
    public static void main(String[] args) {
        ChuNhat hcn1 = new ChuNhat(4, 5);
        ChuNhat hcn2 = new ChuNhat(6, 8);
        Vuong hv = new Vuong(7);

        System.out.println("Hinh chu nhat 1:");
        hcn1.xuat();
        System.out.println("Hinh chu nhat 2:");
        hcn2.xuat();
        System.out.println("Hinh vuong:");
        hv.xuat();
    }
}
