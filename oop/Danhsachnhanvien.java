import java.util.Scanner;

public class Danhsachnhanvien implements Idanhsachnhanvien {
    private Nhanvien[] dsnv;
    private int sl;

    public Danhsachnhanvien(int kt) {
        dsnv = new Nhanvien[kt];
        sl = 0;

    }

    // Thêm nhân viên
    @Override
    public void themNhanvien() {
        Nhanvien nv = new Nhanvien();
        nv.nhap();
        dsnv[sl] = nv;
        sl++;
        System.out.println("Da them nhan vien");
    }

    // Xóa nhân viên
    @Override
    public void xoaNhanvien() {
        if (sl == 0) {
            System.out.println("Danh sach trong khong the xoa");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa");
        int maNv = sc.nextInt();
        sc.nextLine();
        int index = -1;
        for (int i = 0; i < sl; i++) {
            if (dsnv[i].getManv() == maNv) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Khong tìm thấy mã nhân viên: " + maNv);
        } else
            for (int i = index; i < index - 1; i++) {
                dsnv[i] = dsnv[i + 1];

            }
        dsnv[sl - 1] = null;
        sl--;
        System.out.println("Xoa nhan vien thanh cong");
    }

    @Override
    public void suaNhanvien() {
        if (sl == 0) {
            System.out.println("Khong the sua nhan vien");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can tim");
        int maNv = sc.nextInt();

        for (int i = 0; i < sl; i++) {
            if (dsnv[i].getManv() == maNv) {
                System.out.println("Thong tin nhan vien");
                dsnv[i].xuat();
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien voi ma:" + maNv);
    }

    // tìm kiếm nhân viên
    @Override
    public void timKiemnhanvien() {
        if (sl == 0) {
            System.out.println("Danh sach trong");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien");
        int maNv = sc.nextInt();
        for (int i = 0; i < sl; i++) {
            if (dsnv[i].getManv() == maNv) {
                System.out.println("Thong tin nhan vien");
                dsnv[i].xuat();
            }
        }
        System.out.println("Khong tim thay ma nhan vien voi ma :" + maNv);
    }

    @Override
    public void sapXepnhanvien() {
        if (sl < 1) {
            System.out.println("Khong the sap xep");
        }
        for (int i = 0; i < sl - 1; i++) {
            for (int j = i + 1; j < sl; j++) {
                if (dsnv[i].getManv() > dsnv[i].getLuong()) {
                    Nhanvien temp = dsnv[i];
                    dsnv[i] = dsnv[j];
                    dsnv[j] = temp;
                }
            }
        }
        System.out.println("Da sap xep luong nhan vien");
    }

    public void hienThidanhsach() {
        if (sl == 0) {
            System.out.println("Danh sach trong");
        }
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < sl; i++) {
            dsnv[i].xuat();
        }
    }
}