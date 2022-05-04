package OOP_Bai15;


import OOP_Bai15.Service.ManagerStudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerStudentService managerStudentService = new ManagerStudentService();

        while (true) {
            System.out.println("Application");
            System.out.println("Enter 1: To insert Faculty ");
            System.out.println("Enter 2: To insert Students ");
            System.out.println("Enter 3: Phương thức lấy điểm trung bình các môn học của sinh viên dựa vào học kỳ\n" + "cho trước: ");
            System.out.println("Enter 4: Phương thức xác định tổng số sinh viên chính quy của khoa");
            System.out.println("Enter 5: Tìm ra sinh viên có điểm đầu vào cao nhất ở mỗi khoa");
            System.out.println("Enter 6: Ở mỗi khoa, lấy ra danh sách các sinh viên tại chức tại nơi liên kết đào tạo cho\n" +
                    "trước");

            System.out.println("Enter 7: Ở mỗi khoa, lấy ra danh sách sinh viên có điểm trung bình ở học kỳ gần nhất\n" +
                    "(là học kỳ cuối cùng trong danh sách kết quả học tập của sinh viên) từ 8.0 trở\n" +
                    "lên");
            System.out.println("Enter 8: Ở mỗi khoa, tìm ra sinh viên có điểm trung bình học kỳ cao nhất (ở bất kỳ học\n" +
                    "kỳ nào)");
            System.out.println("Enter 9: Ở mỗi khoa, sắp xếp danh sách sinh viên tăng dần theo loại và giảm dần theo\n" +
                    "năm vào học (sử dụng interface Comparable hoặc Comparator)");

            System.out.println("Enter 10: Ở mỗi khoa, thống kê số lượng sinh viên theo năm vào học");
            System.out.println("Enter 11: To exit:");
            int ch = Integer.valueOf(scanner.nextLine());
            switch (ch) {

                case 1: {
                    managerStudentService.addKhoa();
                    break;
                }
                case 2: {
                    System.out.println("input 0 : insert Regular Student.");
                    System.out.println("input 1 => insert InService Student.");
                    int type = Integer.valueOf(scanner.nextLine());
                    managerStudentService.insertStudentType(type);
                    break;
                }
                case 3:
                    System.out.println("Nhap ma sinh vien");
                    String id = scanner.nextLine();
                    System.out.println("nhap ki hoc: ");
                    String semester = scanner.nextLine();
                    managerStudentService.getGPABySemester(id, semester);
                    break;

                case 4:
                    System.out.println("Nhap ten khoa: ");
                    String faculty = scanner.nextLine();
                    System.out.println("Tong so sinh vien chinh quy của khoa " + faculty
                            + managerStudentService.countStudentRegular(faculty));
                    break;

                case 5:
                    System.out.println("Nhap ten khoa: ");
                    String faculty1 = scanner.nextLine();
                    managerStudentService.findHighestEntryPointStudent(faculty1).forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Nhap ten khoa: ");
                    String placeTraining = scanner.nextLine();
                    managerStudentService.getInServiceStudentByPlaceTraining(placeTraining)
                            .forEach(System.out::println);
                    break;
                case 7:
                    System.out.println("Nhap ten khoa: ");
                    String fa = scanner.nextLine();
                    managerStudentService.getAvgGradeThan8Student(fa)
                            .forEach(System.out::println);
                    break;

                case 8:
                    System.out.println("Nhap ten khoa: ");
                    String faa = scanner.nextLine();
                    System.out.println("Nhap hoc ky: ");
                    String semesterr = scanner.nextLine();
                    managerStudentService.getHighestAvgGradeStudent(faa, semesterr)
                            .forEach(System.out::println);
                    break;

                case 9:
                    managerStudentService.sortByAdmissionYear().forEach(System.out::println);
                    break;

                case 10:
                    managerStudentService.studentCountByAdmissionYear();
                    break;

                case 11:
                    return;
            }


        }


    }
}
