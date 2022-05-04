package OOP_Bai11;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner = new Scanner(System.in);

    private SoPhuc sp;

    public Calculator() {
        sp = new SoPhuc();
    }

    public void input() {
        System.out.println("nhap phan thuc: ");
        double phanThuc = Double.valueOf(scanner.nextLine());
        sp.setPhanThuc(phanThuc);
        System.out.println("nhap phan ao: ");
        double phanAo = Double.valueOf(scanner.nextLine());
        sp.setPhanAo(phanAo);

    }

    public void showComplexNumber() {
        System.out.println(sp.toString());
    }

    public SoPhuc sum(SoPhuc n1, SoPhuc n2) {
        //(a + a') + (b + b')i
        SoPhuc n3 = new SoPhuc();
        n3.setPhanThuc(n1.getPhanThuc() + n2.getPhanThuc());
        n3.setPhanAo(n1.getPhanAo() + n2.getPhanAo());
        return n3;
    }

    public SoPhuc multiply(SoPhuc n1, SoPhuc n2) {
        //(a + bi)(a' + b'i) = aa' - bb' + (ab' + a'b)i
        SoPhuc n3 = new SoPhuc();
        n3.setPhanThuc(n1.getPhanThuc() * n2.getPhanThuc() - n1.getPhanAo() * n2.getPhanAo() + n2.getPhanThuc());
        n3.setPhanAo(n1.getPhanThuc() * n2.getPhanAo() + n2.getPhanThuc() * n1.getPhanAo());
        return n3;
    }
}
