package OOP_Bai15.Entity;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Faculty {
    private String name;
    private List<Student> students;

    public Faculty() {
        students = new LinkedList<>();
    }

    public Faculty(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "name='" + name + '\'' +
                '}';
    }
}
