package OOP_Bai15.Entity;

import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Faculty> faculties;

    private List<Student> students;

    public University() {
        faculties = new ArrayList<>();
        students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }
}
