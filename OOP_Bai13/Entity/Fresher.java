package OOP_Bai13.Entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{
    private String graduationDate;
    private String graduationRank;
    private String universityName;

    public Fresher() {
    }

    public Fresher(String fullName, String birthday, String phone, String email, List<Certificate> certificates, String graduationDate, String graduationRank, String universityName) {
        super(fullName, birthday, phone, email, certificates);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return universityName;
    }

    public void setEducation(String education) {
        this.universityName = education;
    }

    @Override
    public String toString() {
        return "Fresher{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", Employee_Type'" + employeeType + '\'' +
                ", graduationDate=" + graduationDate +
                ", graduationRank='" + graduationRank + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }
    @Override
    public void showInformation() {
        System.out.println(this);
    }
}
