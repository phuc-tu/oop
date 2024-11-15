import java.util.Scanner;

public class gut extends Sanpham {
    private String kieugot;
    private double docao;

    public gut() {
        super();
    }

    public gut(double masp, double slcon, double gia, String tensp, String chatlieu, String mau, String kieugot,
            double docao) {
        super(masp, slcon, gia, tensp, chatlieu, mau);
        this.kieugot = kieugot;
        this.docao = docao;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kiu got :");
        kieugot = sc.nextLine();
        System.out.println("Nhap do cao: ");
        docao = sc.nextDouble();
        sc.close();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Kieu got:" + kieugot);
        System.out.println("Do cao:" + docao);
    }
}
