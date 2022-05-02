package OOP_Bai14;

import OOP_Bai14.Util.ManageUI;
import OOP_Bai14.Util.ScannerFactory;
import OOP_Bai14.entity.GoodStudent;
import OOP_Bai14.entity.ManageStudent;
import OOP_Bai14.entity.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = ScannerFactory.getScanner();
        ManageUI manageUI = new ManageUI();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: Lựa chọn ứng viên trúng tuyển vào công ty: ");
            System.out.println("Enter 3: findAll");
            System.out.println("Enter 4: To exit:");
            int ch = Integer.valueOf(scanner.nextLine());
            switch (ch) {
                case 1: {
                    System.out.println("input 0 : insert Good Student.");
                    System.out.println("input 1 => insert Normal Student.");
                    int type = Integer.valueOf(scanner.nextLine());
                    manageUI.insertStudent(type);
                    break;
                }
                case 2:
                    manageUI.showCandidate();
                    break;

                case 3:
                    manageUI.showInforAllStudent();
                    break;

                case 4:
                    return;
            }
        }
    }
}
