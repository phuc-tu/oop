
interface DanhSachKhachHang {
    void themKhachHang(Khachhang kh);

    void xoaKhachHang(int maKh);

    Khachhang timKhachHang(int maKh);

    void hienThiDanhSach();
}

class DanhSachKhachHangImpl implements DanhSachKhachHang {
    private Khachhang[] danhSach;
    private int soLuongKhachHang;

    public DanhSachKhachHangImpl(int kichThuoc) {
        danhSach = new Khachhang[kichThuoc];
        soLuongKhachHang = 0;
    }

    @Override
    public void themKhachHang(Khachhang kh) {
        if (soLuongKhachHang < danhSach.length) {
            danhSach[soLuongKhachHang] = kh;
            soLuongKhachHang++;
            System.out.println("Đã thêm khách hàng thành công!");
        } else {
            System.out.println("Danh sách đã đầy!");
        }
    }

    @Override
    public void xoaKhachHang(int maKh) {
        for (int i = 0; i < soLuongKhachHang; i++) {
            if (danhSach[i].getMaKh() == maKh) {
                for (int j = i; j < soLuongKhachHang - 1; j++) {
                    danhSach[j] = danhSach[j + 1];
                }
                danhSach[soLuongKhachHang - 1] = null;
                soLuongKhachHang--;
                System.out.println("Đã xóa khách hàng có mã " + maKh);
                return;
            }
        }
        System.out.println("Không tìm thấy khách hàng với mã " + maKh);
    }

    @Override
    public Khachhang timKhachHang(int maKh) {
        for (int i = 0; i < soLuongKhachHang; i++) {
            if (danhSach[i].getMaKh() == maKh) {
                return danhSach[i];
            }
        }
        return null;
    }

    @Override
    public void hienThiDanhSach() {
        if (soLuongKhachHang == 0) {
            System.out.println("Danh sách khách hàng trống.");
        } else {
            for (int i = 0; i < soLuongKhachHang; i++) {
                danhSach[i].xuat();
            }
        }
    }
}
