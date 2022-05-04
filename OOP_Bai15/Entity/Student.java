package OOP_Bai15.Entity;


import OOP_Bai15.Exception.BirthDayException;
import OOP_Bai15.Exception.FullNameException;
import OOP_Bai15.Util.Validator;

import java.util.ArrayList;
import java.util.List;

public class Student {
    protected String id;
    protected String fullName;
    protected String dob;

    //năm nhập học
    protected int startYear;
    protected float entryPoint;
    protected String faculty;

    protected List<LearningResult> resultList = new ArrayList<>();

    public Student() {

    }

    public Student(String id, String fullName, String dob, int startYear, float entryPoint, String faculty) {
        this.id = id;
        this.fullName = fullName;
        this.dob = dob;
        this.startYear = startYear;
        this.entryPoint = entryPoint;
        this.faculty = faculty;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws FullNameException {
        if (!Validator.nameCheck(fullName)) {
            throw new FullNameException("Nhap FullName co do dai lớn hơn bằng 10 kí tự và nhỏ hon 50 kí tự!");
        }
        this.fullName = fullName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) throws BirthDayException {
        if(!OOP_Bai15.Util.Validator.birthdayCheck(dob)){
            throw new BirthDayException("Invalid DOB");
        }
        this.dob = dob;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public float getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(float entryPoint) {
        this.entryPoint = entryPoint;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<LearningResult> getResultList() {
        return resultList;
    }

    public void setResultList(List<LearningResult> resultList) {
        this.resultList = resultList;
    }
}
