package OOP_Bai15.Service;

import OOP_Bai15.Entity.*;
import OOP_Bai15.Exception.BirthDayException;
import OOP_Bai15.Exception.FullNameException;

import java.util.*;
import java.util.stream.Collectors;

public class ManagerStudentService {

    private Scanner scanner = new Scanner(System.in);

    private University u;

    public ManagerStudentService() {
        u = new University();
    }

    public void addKhoa() {
        System.out.println("Nhap ten khoa: ");
        String name = scanner.nextLine();
        Faculty f = new Faculty();
        f.setName(name);
        u.getFaculties().add(f);

        System.out.println("ban co muon them sinh vien");


    }

    public void insertStudentType(int type) {
        Student student = null;

        if (type == 0) {
            student = insertStudentRegular();
        }
        if (type == 1) {
            student = insertInServiceStudent();
        }
        u.getStudents().add(student);

    }

    public RegularStudent insertStudentRegular() {
        RegularStudent regularStudent = new RegularStudent();
        System.out.println("nhap id");
        String id = scanner.nextLine();
        regularStudent.setId(id);
        do {
            System.out.println("Nhap fullName: ");
            String fullName = scanner.nextLine();
            try {
                regularStudent.setFullName(fullName);
            } catch (FullNameException e) {
                continue;
            }
            break;
        } while (true);

        do {
            System.out.println("Nhap fullName: ");
            String dateOfBirth = scanner.nextLine();
            try {
                regularStudent.setDob(dateOfBirth);
            } catch (BirthDayException e) {
                continue;
            }
            break;
        } while (true);

        System.out.println("Enter Start year:");
        int startYear = Integer.valueOf(scanner.nextLine());
        regularStudent.setStartYear(startYear);
        System.out.println("Enter entryPoint: ");
        float entryPoint = Float.valueOf(scanner.nextLine());
        regularStudent.setEntryPoint(entryPoint);

        //insert khoa
        System.out.println("Danh sach cac khoa: ");
        u.getFaculties().forEach(System.out::println);

        System.out.println("Nhap ten khoa");

        String faculty = scanner.nextLine();
        regularStudent.setFaculty(faculty);

        LearningResult learningResult = insertSemester();
        regularStudent.getResultList().add(learningResult);


        return regularStudent;


    }

    public InServiceStudent insertInServiceStudent() {
        InServiceStudent inServiceStudent = new InServiceStudent();
        System.out.println("nhap id");
        String id = scanner.nextLine();
        inServiceStudent.setId(id);
        do {
            System.out.println("Nhap fullName: ");
            String fullName = scanner.nextLine();
            try {
                inServiceStudent.setFullName(fullName);
            } catch (FullNameException e) {
                continue;
            }
            break;
        } while (true);

        do {
            System.out.println("Nhap fullName: ");
            String dateOfBirth = scanner.nextLine();
            try {
                inServiceStudent.setDob(dateOfBirth);
            } catch (BirthDayException e) {
                continue;
            }
            break;
        } while (true);

        System.out.println("Enter Start year:");
        int startYear = Integer.valueOf(scanner.nextLine());
        inServiceStudent.setStartYear(startYear);
        System.out.println("Enter entryPoint: ");
        float entryPoint = Float.valueOf(scanner.nextLine());
        inServiceStudent.setEntryPoint(entryPoint);

        //insert khoa
        System.out.println("Danh sach cac khoa: ");
        u.getFaculties().forEach(System.out::println);

        System.out.println("Nhap ten khoa");

        String faculty = scanner.nextLine();

        inServiceStudent.setFaculty(faculty);

        System.out.println("Nhap noi lien kiet dao tao: ");
        String placeTraining = scanner.nextLine();
        inServiceStudent.setTrainingPlace(placeTraining);

        LearningResult learningResult = insertSemester();
        inServiceStudent.getResultList().add(learningResult);
        return inServiceStudent;


    }

    public LearningResult insertSemester() {
        System.out.println("Nhap ten ki hoc");
        String name = scanner.nextLine();

        System.out.println("nhap diem tbM: ");
        float gpa = Float.valueOf(scanner.nextLine());

        return new LearningResult(name, gpa);
    }

    //Phương thức lấy điểm trung bình các môn học của sinh viên dựa vào học kỳ
    //cho trước
    public Float getGPABySemester(String id, String nameSemester) {
        Student student = u.getStudents().stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);

        if (student == null) {
            System.out.println("Ko tim thay sinh vien");
            return null;
        }

        LearningResult learningResult = student.getResultList().stream().filter(r -> r.getName().equals(nameSemester)).findFirst().orElse(null);

        if (learningResult == null) {
            System.out.println("khong tim thay ki hoc!!!");
            return null;

        }

        return learningResult.getGpa();

    }

    //7. Phương thức xác định tổng số sinh viên chính quy của khoa?

    public int countStudentRegular(String faculty) {

        int count = (int) u.getStudents().stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .filter(s -> s instanceof RegularStudent).count();

        return count;
    }
    //8. Tìm ra sinh viên có điểm đầu vào cao nhất ở mỗi khoa

    public List<Student> findHighestEntryPointStudent(String fa) {
        Faculty f = u.getFaculties().stream().filter(faculty -> faculty.getName().equals(fa)).findFirst().orElse(null);

        if (fa == null) {
            System.out.println("khoa ko ton tai!!!");
            return null;
        }
        //tim list sinh vien khoa fa
        List<Student> students = u.getStudents().stream().filter(s -> s.getFaculty().equals(fa)).collect(Collectors.toList());

        //tim diem cao nhat

        float maxGrade = -1;
        for (Student student : students) {
            if (student.getEntryPoint() > maxGrade) maxGrade = student.getEntryPoint();

        }

        final float finalMaxGrade = maxGrade;
        students = students.stream().filter(s -> s.getEntryPoint() == finalMaxGrade).collect(Collectors.toList());

        return students;

    }

    //9. Ở mỗi khoa, lấy ra danh sách các sinh viên tại chức tại nơi liên kết đào tạo cho trước
    public List<InServiceStudent> getInServiceStudentByPlaceTraining(String placeTraining) {

        List<InServiceStudent> inServiceStudents = u.getStudents().stream().filter(student -> student instanceof InServiceStudent).map(student -> (InServiceStudent) student).filter(inServiceStudent -> inServiceStudent.getTrainingPlace().equals(placeTraining)).collect(Collectors.toList());

        return inServiceStudents;

    }

    //10. Ở mỗi khoa, lấy ra danh sách sinh viên có điểm trung bình ở học kỳ gần nhất
    //(là học kỳ cuối cùng trong danh sách kết quả học tập của sinh viên) từ 8.0 trở
    //lên

    public List<Student> getAvgGradeThan8Student(String fa) {
        List<Student> students = u.getStudents().stream().filter(student -> student.getFaculty().equals(fa)).collect(Collectors.toList());


        List<Student> studentList = new ArrayList<>();

        for (Student student : students) {
            List<LearningResult> list = student.getResultList();

            LearningResult learningResult = list.get(list.size() - 1);

            if (learningResult.getGpa() >= 8) {
                studentList.add(student);

            }


        }

        return studentList;
    }

    //11. Ở mỗi khoa, tìm ra sinh viên có điểm trung bình học kỳ cao nhất (ở bất kỳ học
    // kỳ nào)

    public List<Student> getHighestAvgGradeStudent(String fa, String semester) {

        List<Student> students = u.getStudents().stream().filter(student -> student.getFaculty().equals(fa)).collect(Collectors.toList());

        TreeMap<Float, Student> treeMap = new TreeMap();
        for (Student student : students) {
            Float gpa = getGPABySemester(student.getId(), semester);
            treeMap.put(gpa == null ? -1 : gpa, student);
        }

        float highestGrade = treeMap.lastKey().floatValue();

        List<Student> list = new ArrayList<>();

        for (Map.Entry<Float, Student> st : treeMap.entrySet()) {
            if (st.getKey() == highestGrade) list.add(st.getValue());
        }

        return list;

    }

    //12. Ở mỗi khoa, sắp xếp danh sách sinh viên tăng dần theo loại và giảm dần theo
    //năm vào học (sử dụng interface Comparable hoặc Comparator)

    public List<Student> sortByAdmissionYear() {
        return u.getStudents().stream().sorted((s1, s2) -> s2.getStartYear() - s1.getStartYear()).collect(Collectors.toList());
    }

    //13. Ở mỗi khoa, thống kê số lượng sinh viên theo năm vào học. Ví dụ 2020: 100,
    //2019: 90, 2018: 120.

    public void studentCountByAdmissionYear() {
        TreeMap<Integer, Integer> treeMapMap = new TreeMap<>();

        u.getStudents().forEach(s -> {
            if (!treeMapMap.containsKey(s.getStartYear())) {
                treeMapMap.put(s.getStartYear(), 1);
            } else {
                int i = treeMapMap.get(s.getStartYear()) + 1;
                treeMapMap.put(s.getStartYear(), i);
            }

        });
        for (Map.Entry<Integer, Integer> st : treeMapMap.entrySet()) {
            System.out.println(st.getKey() + ": " + st.getValue());

        }
    }

}
