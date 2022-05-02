package OOP_Bai14.entity;

import OOP_Bai14.entity.Student;

public class GoodStudent extends Student {

    private float gpa;

    private String bestRewardName;


    public GoodStudent() {
        setGradeLevel(StudentLevel.GOOD.toString());
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public String toString() {
        return "GoodStudent{" +
                "gpa=" + gpa +
                ", bestRewardName='" + bestRewardName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", bod='" + bod + '\'' +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", universityName='" + universityName + '\'' +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this);
    }
}
