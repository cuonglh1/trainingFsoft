package OOP_Bai13;

import OOP_Bai13.Service.ManageEmployee;
import OOP_Bai13.Util.ManageUI;
import OOP_Bai13.Util.ScannerFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ManageUI manageUI = new ManageUI();
        Scanner scanner = ScannerFactory.getScanner();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert ");
            System.out.println("Enter 2: To search: ");
            System.out.println("Enter 3: Find Intern");
            System.out.println("Enter 4: Find Fresher");
            System.out.println("Enter 5: Find Experience");
            System.out.println("Enter 6: Delete by IdEmpoyee");
            System.out.println("Enter 7: findAll");
            System.out.println("Enter 8: To exit:");
            int ch = Integer.valueOf(scanner.nextLine());
            switch (ch) {
                case 1: {
                    System.out.println("input 0 : insert Experience");
                    System.out.println("input 1 => insert Fresher");
                    System.out.println("input 2 => insert Intern");
                    int type = Integer.valueOf(scanner.nextLine());
                    manageUI.insert(type);
                    break;
                }
                case 3:
                    manageUI.findIntern();
                    break;
                case 4:
                    manageUI.findFresher();
                    break;
                case 5:
                    manageUI.findExperience();
                    break;
                case 6:
                    manageUI.delete();
                    break;
                case 7:
                    manageUI.findAll();
                    break;

                case 8:
                    return;
            }

        }

    }


}
