package OOP_Bai14.Util;

import OOP_Bai14.Exception.FullNameException;
import OOP_Bai14.entity.*;

import java.util.Scanner;

public class ManageUI {

    Scanner scanner = ScannerFactory.getScanner();
    ManageStudent manageStudent = new ManageStudent();

    public void insertStudent(int type) {
        Student student = null;
        //0 : input goodStudent
        //1 : input normalStudent

        if (type == 0) {
            student = inputGoodStudent();
        }
        if (type == 1) {
            student = inputNormalStudent();
        }
        manageStudent.addStudent(student);

    }

    private GoodStudent inputGoodStudent() {

        GoodStudent goodStudent = new GoodStudent();
        do {
            System.out.println("Nhap fullName: ");
            String fullName = scanner.nextLine();
            try {
                goodStudent.setFullName(fullName);
            } catch (FullNameException e) {
                continue;
            }
            break;
        } while (true);
//        do {
//            System.out.println("nhap Bod");
//            String bod = scanner.nextLine();
//            try {
//                goodStudent.setBod(bod);
//            } catch (BirthDayException e) {
//                continue;
//            }
//            break;
//
//        } while (true);
//        do {
//            System.out.println("Nhap phone: ");
//            String phone = scanner.nextLine();
//            try {
//                goodStudent.setPhoneNumber(phone);
//            } catch (PhoneException e) {
//                continue;
//            }
//            break;
//        } while (true);
        System.out.println("Nhap gender: ");
        String gender = scanner.nextLine();
        goodStudent.setGender(gender);
        System.out.println("Nhap universityName: ");
        String universityName = scanner.nextLine();
        goodStudent.setUniversityName(universityName);
        goodStudent.setGradeLevel(StudentLevel.GOOD.toString());
        System.out.println("Nhap GPA: ");
        float gpa = Float.valueOf(scanner.nextLine());
        goodStudent.setGpa(gpa);
        System.out.println("Enter bestRewardName :");
        String bestRewardName = scanner.nextLine();
        goodStudent.setBestRewardName(bestRewardName);
        return goodStudent;
    }

    private NormalStudent inputNormalStudent() {

        NormalStudent normalStudent = new NormalStudent();
        do {
            System.out.println("Nhap fullName: ");
            String fullName = scanner.nextLine();
            try {
                normalStudent.setFullName(fullName);
            } catch (FullNameException e) {
                continue;
            }
            break;
        } while (true);
//        do {
//            System.out.println("nhap Bod");
//            String bod = scanner.nextLine();
//            try {
//                normalStudent.setBod(bod);
//            } catch (BirthDayException e) {
//                continue;
//            }
//            break;
//
//        } while (true);
//        do {
//            System.out.println("Nhap phone: ");
//            String phone = scanner.nextLine();
//            try {
//                normalStudent.setPhoneNumber(phone);
//            } catch (PhoneException e) {
//                continue;
//            }
//            break;
//        } while (true);
        System.out.println("Nhap gender: ");
        String gender = scanner.nextLine();
        normalStudent.setGender(gender);
        System.out.println("Nhap universityName: ");
        String universityName = scanner.nextLine();
        normalStudent.setUniversityName(universityName);
        normalStudent.setGradeLevel(StudentLevel.NORMAL.toString());
        System.out.println("Enter EL Score: ");
        int englishScore = Integer.valueOf(scanner.nextLine());
        normalStudent.setEnglishScore(englishScore);
        System.out.println("Enter entryTest Score: ");
        int entryTestScore = Integer.valueOf(scanner.nextLine());
        normalStudent.setEntryTestScore(entryTestScore);

        return normalStudent;

    }

    public void showCandidate() {
        System.out.println("input so luong: ");
        int n = Integer.valueOf(scanner.nextLine());
        System.out.println("-----Danh sách sinh viên trúng tuyển-----");
        manageStudent.selectCandidate(n).forEach(Student::showInfor);
    }

    public void showInforAllStudent() {
        System.out.println("*****Infor Students*****");
        manageStudent.showInforStudent();
    }

}
