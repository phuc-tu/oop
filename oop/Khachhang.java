import java.util.Scanner;

public class Khachhang {
    private int maKh;
    private String name;
    private int number;
    private String address;
    private String loaiKh;

    public Khachhang() {

    }

    public Khachhang(int maKh, String name, int number, String address, String loaiKh) {
        this.maKh = maKh;
        this.name = name;
        this.number = number;
        this.address = address;
        this.loaiKh = loaiKh;
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

    public int getNumber() {
        return number;

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoaiKh() {
        return loaiKh;
    }

    public void setLoaiKh(String loaiKh) {
        this.loaiKh = loaiKh;
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
        System.out.println(" Loai khach hang: ");
        loaiKh = sc.nextLine();

    }

    public void xuat() {
        System.out.println("Ma khach hang :" + maKh);
        System.out.println("Ten :" + name);
        System.out.println("So dien thoai :" + number);
        System.out.println("nhap dia chi :" + address);
        System.out.println("Loai khach hang :" + loaiKh);
    }

}
