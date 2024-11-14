import java.util.Scanner;

public class Sanpham {
    private double masp, slcon, gia;
    private String tensp, chatlieu, mau;

    public Sanpham() {

    }

    public Sanpham(double masp, double slcon, double gia, String tensp, String chatlieu, String mau) {
        this.masp = masp;
        this.slcon = slcon;
        this.gia = gia;
        this.tensp = tensp;
        this.chatlieu = chatlieu;
        this.mau = mau;

    }

    public double getMasp() {
        return masp;
    }

    public void setMasp(double masp) {
        this.masp = masp;
    }

    public double getSlcon() {
        return slcon;
    }

    public void setSlcon(double slcon) {
        this.slcon = slcon;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatleu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma san pham");
        masp = sc.nextDouble();
        System.out.println("Nhap ten sn pham");
        tensp = sc.nextLine();
        System.out.println("Nhap chat lieu san pham");
        chatlieu = sc.nextLine();
        System.out.println("Nhap gia");
        gia = sc.nextDouble();
        System.out.println("Nhap so luong con trong kho");
        slcon = sc.nextDouble();
        System.out.println("Nhap mau");
        mau = sc.nextLine();
        sc.close();
    }

    public void xuat() {
        System.out.println("Ma san pham:" + masp);
        System.out.println("Ten san pham :" + tensp);
        System.out.println("Nhap chat lieu:" + chatlieu);
        System.out.println("Gia:" + gia);
        System.out.println("So luong con tỏng kho:" + slcon);
        System.out.println("Mau: " + mau);

    }
}