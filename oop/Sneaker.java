import java.util.Scanner;

public class Sneaker extends Sanpham {
    private double coday;
    private String ungdung;

    public Sneaker() {
        super();
    }

    public Sneaker(double masp, double slcon, double gia, String tensp, String chatlieu, String mau, double coday,
            String ungdung) {
        super(masp, slcon, gia, tensp, chatlieu, mau);
        this.coday = coday;
        this.ungdung = ungdung;
    }

    public double getCoday() {
        return coday;

    }

    public void setCoday(double coday) {
        this.coday = coday;
    }

    public String getUngdung() {
        return ungdung;
    }

    public void setUngdung(String ungdung) {
        this.ungdung = ungdung;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co day:");
        coday = sc.nextDouble();
        System.out.println("Ung dung cua giay :");
        ungdung = sc.nextLine();

    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("coday:" + coday);
        System.out.println("ung dung:" + ungdung);

    }
}
