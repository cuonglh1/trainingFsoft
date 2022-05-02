package OOP_Bai13.Util;

import OOP_Bai13.Entity.*;
import OOP_Bai13.Exception.BirthDayException;
import OOP_Bai13.Exception.EmailException;
import OOP_Bai13.Exception.FullNameException;
import OOP_Bai13.Exception.PhoneException;
import OOP_Bai13.Service.ManageEmployee;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageUI {
    private Scanner scanner = ScannerFactory.getScanner();
    private ValidationService validationService = new ValidationService();
    private ManageEmployee manageEmployee = new ManageEmployee();

    public void insert(int type) {
        // input 0 => insert Experience
        // input 1 => insert Fresher
        // input 2 => insert Intern

        Employee employee = null;

        if (type == 0) {
            employee = insertExperience();
            employee.setEmployeeType(EmployeeType.EXPERIENCE);
        }
        if (type == 1) {
            employee = insertFresher();
            employee.setEmployeeType(EmployeeType.FRESHER);

        }

        if (type == 2) {
            employee = insertIntern();
            employee.setEmployeeType(EmployeeType.INTERN);
        }

        try {
            validationService.checkData(employee);
        } catch (EmailException e) {
            insert(type);
        } catch (PhoneException e) {
            insert(type);
        } catch (FullNameException e) {
            insert(type);
        } catch (BirthDayException e) {
            insert(type);
        }
        manageEmployee.insert(employee);

    }

    private Experience insertExperience() {
        System.out.println("Nhap fullName: ");
        String fullName = scanner.nextLine();
        System.out.println("nhap Bod");
        String bod = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap yearOfExperience: ");
        int yearOfExperience = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhap proSkill: ");
        String proSkill = scanner.nextLine();
        Experience experience = new Experience(fullName, bod, phone, email, new ArrayList<Certificate>(), yearOfExperience, proSkill);
        return experience;
    }

    private Fresher insertFresher() {
        System.out.println("Nhap fullName: ");
        String fullName = scanner.nextLine();
        System.out.println("nhap Bod");
        String bod = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("nhap graduationDate");
        String graduationDate = scanner.nextLine();
        System.out.println("Xep loai tot nghiep");
        String graduationRank = scanner.nextLine();
        System.out.println("nhap truong dai hoc: ");
        String universityName = scanner.nextLine();
        Fresher fresher = new Fresher(fullName, bod, phone, email, new ArrayList<Certificate>(), graduationDate, graduationRank, universityName);

        return fresher;

    }

    private Intern insertIntern() {
        System.out.println("Nhap fullName: ");
        String fullName = scanner.nextLine();
        System.out.println("nhap Bod");
        String bod = scanner.nextLine();
        System.out.println("Nhap phone: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Nhap major: ");
        String major = scanner.nextLine();
        System.out.println("Nhap semester: ");
        int semester = Integer.valueOf(scanner.nextLine());
        System.out.println("universityName ");
        String universityName = scanner.nextLine();

        return new Intern(fullName, bod, phone, email, new ArrayList<Certificate>(), major, semester, universityName);

    }

    public void findIntern() {
        manageEmployee.findByType(2).forEach(e -> e.showInformation());
    }

    public void findFresher() {
        manageEmployee.findByType(1).forEach(e -> e.showInformation());
    }

    public void findExperience() {
        manageEmployee.findByType(0).forEach(e -> e.showInformation());
    }

    public void findAll() {
        manageEmployee.findAll().forEach(e -> e.showInformation());
    }

    public void delete() {
        System.out.println("Enter id: ");
        String id = scanner.nextLine();
        manageEmployee.deleteById(id);
        System.out.println("Delete Success!!!");
    }

}
