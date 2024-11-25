import java.util.Scanner;

public class Danhsachnhanvien implements Idanhsachnhanvien {
    private Nhanvien[] dsnv;
    private int size;

    public Danhsachnhanvien(int n) {
        dsnv = new Nhanvien[n];
        int size = 0;

    }

    @Override
    public void taoDanhsachnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong nhan vien hien co:");
        int a = sc.nextInt();
        sc.nextLine();

        dsnv = new Nhanvien[a];
        size = a;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1) + ":");
            Nhanvien nv = new Nhanvien();
            nv.nhap();
            dsnv[i] = nv;
        }
    }

    @Override
    public void xoaNhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can xoa:");
        int maNv = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (dsnv[i].getManv() == maNv) {
                for (int j = i; j < size - 1; j++) {// Di chuyền các phần tử phía trước để xóa nhân viên
                    dsnv[j] = dsnv[j + 1];
                }
                dsnv[size - 1] = null;// xóa nhân viên cuối cùng
                size--;
                found = true;
                System.out.println("Da xoa nhan vien thanh cong voi ma:" + maNv);
                break;
            }
        }
        if (!found)
            System.out.println(" Khong tim thay ma:");
    }

    @Override
    public void suaNhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien can sua thong tin nhan vien:");
        int maNv = sc.nextInt();
        sc.nextLine();

        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (dsnv[i].getManv() == maNv) {
                dsnv[i].nhap();
                found = true;
                System.out.println("Sua thong tin thanh cong voi ma nhan vien:" + maNv);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ma nhan vien");
        }
    }

    @Override
    public void timKiemnhanvien() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien can tim:");
        String ten = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (dsnv[i].getName().equalsIgnoreCase(ten)) {
                dsnv[i].xuat();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien voi ten " + ten);
        }
    }

    @Override
    public void sapXepnhanvien() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (dsnv[i].getLuong() > dsnv[j].getLuong()) {
                    Nhanvien temp = dsnv[i];
                    dsnv[i] = dsnv[j];
                    dsnv[j] = temp;

                }
            }
        }
        System.out.println("Danh sach nhan vien sau khi sap xep la:");
        hienThidanhsachnv();
    }

    @Override
    public void hienThidanhsachnv() {
        if (size == 0) {
            System.out.println("Danh sach nhan vien rong:");
        } else {
            for (int i = 0; i < size; i++) {
                dsnv[i].xuat();
            }
        }
    }
}