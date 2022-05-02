package OOP_Bai9;

public class KhachHang {
    private String hoTenChuNha;
    private String soNha;
    private int maSoCongTo;

    public KhachHang() {

    }

    public KhachHang(String hoTenChuNha, String soNha, int maSoCongTo) {
        this.hoTenChuNha = hoTenChuNha;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getHoTenChuNha() {
        return hoTenChuNha;
    }

    public void setHoTenChuNha(String hoTenChuNha) {
        this.hoTenChuNha = hoTenChuNha;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "hoTenChuNha='" + hoTenChuNha + '\'' +
                ", soNha='" + soNha + '\'' +
                ", maSoCongTo=" + maSoCongTo +
                '}';
    }
}
