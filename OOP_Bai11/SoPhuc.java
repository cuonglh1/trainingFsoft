package OOP_Bai11;

public class SoPhuc {
    private double phanThuc;

    private double phanAo;

    public SoPhuc() {

    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return "SoPhuc{" +
                "phanThuc=" + phanThuc +
                ", phanAo=" + phanAo +
                '}';
    }
}
