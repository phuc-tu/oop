
import java.util.Scanner;

public class Nhanvien {
    private String name;
    private String gender;
    private String address;
    private String calam;
    private double luong;
    private int maNv;

    public Nhanvien() {
    }

    public Nhanvien(String name, String gender, String address, String calam, int maNv, double luong) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.calam = calam;
        this.maNv = maNv;
        this.luong = luong;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCalam() {
        return this.calam;
    }

    public void setCalam(String calam) {
        this.calam = calam;
    }

    public int getManv() {
        return this.maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public double getLuong() {
        return this.luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = sc.nextLine();
        System.out.println("Nhap gioi tinh");
        gender = sc.nextLine();
        System.out.println("Nhap dia chi");
        address = sc.nextLine();
        System.out.println("Nhap ca lam");
        calam = sc.nextLine();
        System.out.println("Nhap ma nhan vien");
        maNv = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap luong");
        luong = sc.nextDouble();
        sc.nextLine();

    }

    public void xuat() {
        System.out.println("Ten :" + name);
        System.out.println("Gioi tinh:" + gender);
        System.out.println("Dia chi:" + address);
        System.out.println("Ca lam:" + calam);
        System.out.println("Ma nhan vien:" + maNv);
        System.out.println("Luong:" + luong);
    }
}
