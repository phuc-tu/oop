import java.util.Scanner;

public class Khachhang {
    private int maKh;
    private String name;
    private double number;
    private String address;
    private double sotiengd;

    public Khachhang() {

    }

    public Khachhang(int maKh, String name, double number, String address, double sotiengd) {
        this.maKh = maKh;
        this.name = name;
        this.number = number;
        this.address = address;
        this.sotiengd = sotiengd;
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;

    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSotiengd() {
        return sotiengd;
    }

    public void setLoaiKh(double sotiengd) {
        this.sotiengd = sotiengd;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang");
        maKh = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten ;");
        name = sc.nextLine();
        System.out.println("Nhap so dien thoai:");
        number = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap address :");
        address = sc.nextLine();
        System.out.println(" Nhap so tien giao dich: ");
        sotiengd = sc.nextDouble();

    }

    public void xuat() {
        System.out.println("Ma khach hang :" + maKh);
        System.out.println("Ten :" + name);
        System.out.println("So dien thoai :" + number);
        System.out.println("Nhap dia chi :" + address);
        System.out.println("So tien giao dich cua khach hang :" + sotiengd);
    }

}
