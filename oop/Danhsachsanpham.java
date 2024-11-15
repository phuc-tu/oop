import java.util.Scanner;

public class Danhsachsanpham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong Nhan vien");
        int sl = sc.nextInt();
        Danhsachnhanvien dsnv = new Danhsachnhanvien(sl);
        int chon;
        do {
            System.out.println(".... Moi ban chon");
            System.out.println("1.Them nha vien");
            System.out.println("2.Xoa nhan vien");
            System.out.println("3.Sua nhan vien");
            System.out.println("4.Tim kiem nhan vien");
            System.out.println("5.Sap xep nhan vien theo luong");
            System.out.println("6.Hien thi");
            System.out.println("Nhap lua chon cua ban");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    dsnv.themNhanvien();
                    break;
                case 2:
                    dsnv.themNhanvien();
                    break;
                case 3:
                    dsnv.xoaNhanvien();
                    break;
                case 4:
                    dsnv.timKiemnhanvien();
                    break;
                case 5:
                    dsnv.sapXepnhanvien();
                    break;
                case 6:
                    dsnv.hienThidanhsach();
                    break;

                default:
                    System.out.println("Lua chon khong hop le moi chon lai");
                    break;
            }
        } while (chon != 6);
    }
}
