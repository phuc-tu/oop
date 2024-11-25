import java.util.Scanner;

public class Danhsachkhachhang implements IDanhsachkhachhang {
    Scanner sc = new Scanner(System.in);
    private Khachhang[] dskh;
    private int size;

    public Danhsachkhachhang(int m) {
        dskh = new Khachhang[m];
        size = 0;
    }

    @Override
    public void taoDanhsachkhachhang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong khach hang:");
        int a = sc.nextInt();
        sc.nextLine();
        dskh = new Khachhang[a];
        size = a;
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap so khach hang thu " + (i + 1) + ":");
            Khachhang kh = new Khachhang();
            kh.nhap();
            dskh[i] = kh;

        }
    }

    @Override
    public void suaKhachhang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang can sua:");
        int maKh = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (dskh[i].getMaKh() == maKh) {
                dskh[i].nhap();
                found = true;
                System.out.println("Da sua thong tin khach hang vơi ma:" + maKh);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay ma khach hang voi ma:" + maKh);
        }
    }

    @Override
    public void xoaKhachhang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang can xoa:");
        int maKh = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (dskh[i].getMaKh() == maKh) {
                for (int j = i; j < size - 1; j = i - 1) {
                    dskh[i] = dskh[j + 1];
                }
                dskh[size - 1] = null;
                size--;
                found = true;
                System.out.println("Da xoa khach hang voi ma:" + maKh);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong the tim thay ma khach hang voi ma:" + maKh);
        }

    }

    @Override
    public void timKiemKhachhang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang can tim:");
        String name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (dskh[i].getName().equalsIgnoreCase(name)) {
                dskh[i].xuat();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien voi ten " + name);
        }
    }

    @Override
    public void sapXepKhachhang() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (dskh[i].getSotiengd() > dskh[j].getSotiengd()) {
                    Khachhang temp = dskh[i];
                    dskh[i] = dskh[j];
                    dskh[j] = temp;

                }
            }
        }
        System.out.println("Danh sach nhan vien sau khi sap xep la:");
        hienThidanhsachkh();
    }

    @Override
    public void hienThidanhsachkh() {
        if (size == 0) {
            System.out.println("Danh sach khach hang rong:");
        } else {
            for (int i = 0; i < size; i++) {
                dskh[i].xuat();
            }
        }
    }
}
