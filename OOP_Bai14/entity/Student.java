package OOP_Bai14.entity;

import OOP_Bai14.Exception.BirthDayException;
import OOP_Bai14.Exception.FullNameException;
import OOP_Bai14.Exception.PhoneException;
import OOP_Bai14.Util.Validator;

public abstract class Student {
    protected String fullName;
    protected String bod;
    protected String gender;
    protected String phoneNumber;
    protected String universityName;
    protected String gradeLevel;

    public Student() {

    }

    public Student(String fullName, String bod, String gender, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.bod = bod;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
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

    public String getBod() {
        return bod;
    }

    public void setBod(String bod) throws BirthDayException {
        if (!Validator.birthdayCheck(bod)) {
            throw new BirthDayException("BirthDay inValid!");
        }
        this.bod = bod;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) throws PhoneException {
        if (!Validator.phoneCheck(phoneNumber)) {
            throw new PhoneException("Phone không hợp lệ!");
        }
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public abstract void showInfor();
}
