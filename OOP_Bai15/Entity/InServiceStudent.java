package OOP_Bai15.Entity;

import OOP_Bai15.Entity.Student;

public class InServiceStudent extends Student {

    private String trainingPlace;

    public InServiceStudent() {

    }

    public InServiceStudent(String id, String fullName, String dob, int startYear,
                            float entryPoint, String faculty, String trainingPlace) {
        super(id, fullName, dob, startYear, entryPoint, faculty);
        this.trainingPlace = trainingPlace;
    }

    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }
}
