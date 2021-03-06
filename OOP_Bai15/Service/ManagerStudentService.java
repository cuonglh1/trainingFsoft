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

    //Ph????ng th???c l???y ??i???m trung b??nh c??c m??n h???c c???a sinh vi??n d???a v??o h???c k???
    //cho tr?????c
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

    //7. Ph????ng th???c x??c ?????nh t???ng s??? sinh vi??n ch??nh quy c???a khoa?

    public int countStudentRegular(String faculty) {

        int count = (int) u.getStudents().stream()
                .filter(student -> student.getFaculty().equals(faculty))
                .filter(s -> s instanceof RegularStudent).count();

        return count;
    }
    //8. T??m ra sinh vi??n c?? ??i???m ?????u v??o cao nh???t ??? m???i khoa

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

    //9. ??? m???i khoa, l???y ra danh s??ch c??c sinh vi??n t???i ch???c t???i n??i li??n k???t ????o t???o cho tr?????c
    public List<InServiceStudent> getInServiceStudentByPlaceTraining(String placeTraining) {

        List<InServiceStudent> inServiceStudents = u.getStudents().stream().filter(student -> student instanceof InServiceStudent).map(student -> (InServiceStudent) student).filter(inServiceStudent -> inServiceStudent.getTrainingPlace().equals(placeTraining)).collect(Collectors.toList());

        return inServiceStudents;

    }

    //10. ??? m???i khoa, l???y ra danh s??ch sinh vi??n c?? ??i???m trung b??nh ??? h???c k??? g???n nh???t
    //(l?? h???c k??? cu???i c??ng trong danh s??ch k???t qu??? h???c t???p c???a sinh vi??n) t??? 8.0 tr???
    //l??n

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

    //11. ??? m???i khoa, t??m ra sinh vi??n c?? ??i???m trung b??nh h???c k??? cao nh???t (??? b???t k??? h???c
    // k??? n??o)

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

    //12. ??? m???i khoa, s???p x???p danh s??ch sinh vi??n t??ng d???n theo lo???i v?? gi???m d???n theo
    //n??m v??o h???c (s??? d???ng interface Comparable ho???c Comparator)

    public List<Student> sortByAdmissionYear() {
        return u.getStudents().stream().sorted((s1, s2) -> s2.getStartYear() - s1.getStartYear()).collect(Collectors.toList());
    }

    //13. ??? m???i khoa, th???ng k?? s??? l?????ng sinh vi??n theo n??m v??o h???c. V?? d??? 2020: 100,
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
