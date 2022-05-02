package OOP_Bai9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MangerCustomer {

    private List<KhachHang> khachHangs;

    public MangerCustomer() {
        khachHangs = new ArrayList<>();
    }

    public void inputKhachHang() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên chủ hộ: ");
        String hoTenChuNha = scanner.nextLine();
        System.out.print("Nhập số nhà: ");
        String soNha = scanner.nextLine();
        System.out.print("Mã số công tơ: ");
        int maSoCongTo = scanner.nextInt();
        khachHangs.add(new KhachHang(hoTenChuNha, soNha, maSoCongTo));
    }


    public BienLai tinhTienDien(int maSoCongto, int chiSoCu, int chiSoMoi) {

        //kiem tra ma so cong to co tôn tai?

        KhachHang khachHang = khachHangs.stream().filter(kh -> kh.getMaSoCongTo() == maSoCongto).findFirst()
                .orElse(null);

        if (khachHang == null) {
            return null;
        }

        BienLai bienLai = new BienLai();
        bienLai.setKhachHang(khachHang);
        bienLai.setChiSoCu(chiSoCu);
        bienLai.setChiSoMoi(chiSoMoi);
        bienLai.setSoTienPhaiTra((chiSoMoi - chiSoCu) * 5);
        return  bienLai;
    }
    public void showKhachHang() {
        this.khachHangs.forEach(System.out::println);

    }

}
