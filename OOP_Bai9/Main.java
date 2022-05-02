package OOP_Bai9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MangerCustomer mangerCustomer = new MangerCustomer();
        while (true) {
            System.out.println("Application Manager Khach Hang");
            System.out.println("Enter 1: To insert khach hang");
            System.out.println("Enter 2: To  show Bien Lai Khach Hang: ");
            System.out.println("Enter 3: Show infor Khach hang");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    mangerCustomer.inputKhachHang();
                    break;

                }
                case "2":
                    System.out.println("nhap ma so cong to: ");
                    int masocongto = Integer.valueOf(scanner.nextLine());
                    int chisocu = 0;
                    int chisomoi = 0;
                    do {
                        System.out.println("nhap chi so cu: ");
                        chisocu = Integer.valueOf(scanner.nextLine());
                        System.out.println("nhap chi so moi: ");
                        chisomoi = Integer.valueOf(scanner.nextLine());
                    } while (chisocu > chisomoi);
                    System.out.println(mangerCustomer.tinhTienDien(masocongto, chisocu, chisomoi));
                    break;

                case "3":
                    mangerCustomer.showKhachHang();
                    break;

                case "4":
                    return;

            }
        }

    }
}
