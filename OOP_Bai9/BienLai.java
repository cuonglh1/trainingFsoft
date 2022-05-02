package OOP_Bai9;

public class BienLai {

    private int chiSoCu;
    private int chiSoMoi;
    private double soTienPhaiTra;
    private KhachHang khachHang;

    public BienLai() {

    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public double getSoTienPhaiTra() {
        return soTienPhaiTra;
    }

    public void setSoTienPhaiTra(double soTienPhaiTra) {
        this.soTienPhaiTra = soTienPhaiTra;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public BienLai(int chiSoCu, int chiSoMoi, double soTienPhaiTra, KhachHang khachHang) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.soTienPhaiTra = soTienPhaiTra;
        this.khachHang = khachHang;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "chiSoCu=" + chiSoCu +
                ", chiSoMoi=" + chiSoMoi +
                ", soTienPhaiTra=" + soTienPhaiTra + " VND" +
                ", khachHang=" + khachHang +
                '}';
    }
}
