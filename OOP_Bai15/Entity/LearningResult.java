package OOP_Bai15.Entity;

public class LearningResult {

    //ten học kì
    private String name;

    private float gpa;

    public LearningResult() {

    }

    public LearningResult(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
