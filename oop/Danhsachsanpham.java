import java.util.Scanner;

public class Danhsachsanpham {
    public void nhapNv() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien toi da trong danh sach:");
        int n = sc.nextInt();
        sc.nextLine();
        Danhsachnhanvien danhSachNhanVien = new Danhsachnhanvien(n);

        int choice;
        do {
            System.out.println("\n====== MENU QUAN LY NHAN VIEN ======");
            System.out.println("1. Tao danh sach nhan vien");
            System.out.println("2. Hien thi danh sach nhan vien");
            System.out.println("3.Them nhan vien:");
            System.out.println("4. Xoa nhan vien");
            System.out.println("5. Sua nhan vien");
            System.out.println("6. Tim kiem nhan vien");
            System.out.println("7. Sap xep nhan vien theo luong tang dan");

            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    danhSachNhanVien.taoDanhsachnhanvien();
                    break;
                case 2:
                    danhSachNhanVien.hienThidanhsachnv();
                    break;
                case 3:
                    danhSachNhanVien.themNhanvien();
                    break;
                case 4:
                    danhSachNhanVien.xoaNhanvien();
                    break;
                case 5:
                    danhSachNhanVien.suaNhanvien();
                    break;
                case 6:
                    danhSachNhanVien.timKiemnhanvien();
                    break;
                case 7:
                    danhSachNhanVien.sapXepnhanvien();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
            }
        } while (choice != 0);

    }

    public void nhapKh() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang toi da trong danh sach:");
        int m = sc.nextInt();
        sc.nextLine();
        Danhsachkhachhang danhsachkhachhang = new Danhsachkhachhang(m);

        int choice;
        do {
            System.out.println("\n====== MENU QUAN LY KHACH HANG ======");
            System.out.println("1. Tao danh sach khach hang");
            System.out.println("2. Hien thi danh sach khach hang");
            System.out.println("3.Them nhan vien:");
            System.out.println("4. Xoa khach hang");
            System.out.println("5. Sua khach hang");
            System.out.println("6. Tim kiem khach hang");
            System.out.println("7. Sap xep khach hang theo luong tang dan");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon cua ban: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    danhsachkhachhang.taoDanhsachkhachhang();
                    break;
                case 2:
                    danhsachkhachhang.hienThidanhsachkh();
                    break;
                case 3:
                    danhsachkhachhang.themKhachhang();
                    break;
                case 4:
                    danhsachkhachhang.xoaKhachhang();
                    break;
                case 5:
                    danhsachkhachhang.suaKhachhang();
                    break;
                case 6:
                    danhsachkhachhang.timKiemKhachhang();
                    break;
                case 7:
                    danhsachkhachhang.sapXepKhachhang();
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long nhap lai.");
            }
        } while (choice != 0);

        sc.close();
    }

}
