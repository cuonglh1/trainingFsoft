package OOP_Bai14.entity;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManageStudent {

    private List<Student> studentList;

    public ManageStudent() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public List<Student> selectCandidate(int n) {

        Stream<GoodStudent> goodStudent = studentList.stream().filter(o -> o instanceof GoodStudent).map(s -> (GoodStudent) s);
        Supplier<Stream<NormalStudent>> normalStudent = () -> studentList.stream().filter(o -> o instanceof NormalStudent).map(s -> (NormalStudent) s);

        //count normalStudent
        int numberNormalStudent = (int) normalStudent.get().count();

        //count GoodStudent
        int numberGoodStudent = studentList.size() - numberNormalStudent;

        List<Student> students = new ArrayList<>();

        if (numberGoodStudent > n) {
            students = goodStudent.sorted(Comparator.comparing(GoodStudent::getGpa).reversed().thenComparing((s1, s2) -> s2.getFullName().compareTo(s1.getFullName()))).limit(n).collect(Collectors.toList());

        }

        //neu so luong sv gioi = so luong trung tuyen thì lay het sinh vien kha gioi
        if (numberGoodStudent == n) {
            students = goodStudent.collect(Collectors.toList());
        }

        if (numberGoodStudent < n) {
            //else so luong sv gioi < so luong can tuyen thi lua chon them các sinh viên TB
            List<Student> list = normalStudent.get().sorted(Comparator.comparing(NormalStudent::getEntryTestScore).reversed().thenComparing((s1, s2) -> s2.getEnglishScore() - s1.getEnglishScore()).thenComparing((s1, s2) -> s2.getFullName().compareTo(s1.getFullName()))).limit(n - numberGoodStudent).collect(Collectors.toList());

            students.addAll(goodStudent.collect(Collectors.toList()));
            students.addAll(list);
        }

        return students;

    }

    public void showInforStudent() {
        List<Student> list = studentList.stream().sorted(Comparator.comparing(Student::getFullName).reversed().thenComparing(Student::getPhoneNumber)).collect(Collectors.toList());
        list.forEach(Student::showInfor);
    }

}
