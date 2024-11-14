import java.util.Scanner;

public class Danhsachsanpham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng khách hàng tối đa: ");
        int kichThuoc = sc.nextInt();
        DanhSachKhachHangImpl danhSach = new DanhSachKhachHangImpl(kichThuoc);

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Xóa khách hàng");
            System.out.println("3. Tìm kiếm khách hàng");
            System.out.println("4. Hiển thị danh sách khách hàng");
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Khachhang kh = new Khachhang();
                    kh.nhap();
                    danhSach.themKhachHang(kh);
                    break;
                case 2:
                    System.out.print("Nhập mã khách hàng cần xóa: ");
                    int maXoa = sc.nextInt();
                    danhSach.xoaKhachHang(maXoa);
                    break;
                case 3:
                    System.out.print("Nhập mã khách hàng cần tìm: ");
                    int maTim = sc.nextInt();
                    Khachhang khTim = danhSach.timKhachHang(maTim);
                    if (khTim != null) {
                        khTim.xuat();
                    } else {
                        System.out.println("Không tìm thấy khách hàng với mã " + maTim);
                    }
                    break;
                case 4:
                    danhSach.hienThiDanhSach();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);

        sc.close();
    }
}
