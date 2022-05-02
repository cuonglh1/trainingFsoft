package OOP_Bai14.entity;

public class NormalStudent extends Student {
    private int englishScore;
    private int entryTestScore;


    public NormalStudent() {

    }

    public NormalStudent(String fullName, String bod, String gender, String phoneNumber, String universityName, String gradeLevel, int englishScore, int entryTestScore) {
        super(fullName, bod, gender, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public  int getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(int entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public String toString() {
        return "NormalStudent{" +
                "englishScore=" + englishScore +
                ", entryTestScore=" + entryTestScore +
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
