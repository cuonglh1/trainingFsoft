package OOP_Bai13.Entity;

import java.util.List;

public abstract class Employee {

    public static long count = 0;
    protected String id;
    protected String fullName;
    protected String birthday;
    protected String phone;
    protected String email;

    public static long getCount() {
        return count;
    }

    public static void setCount(long count) {
        Employee.count = count;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    protected EmployeeType employeeType;
    protected List<Certificate> certificates;

    public Employee() {
    }

    public Employee(String fullName, String birthday, String phone, String email, List<Certificate> certificates) {
        this.id = "Emp" + ++count;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.certificates = certificates;
    }

    public abstract void showInformation();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificates() {
        return certificates;
    }

    public void setCertificates(List<Certificate> certificates) {
        this.certificates = certificates;
    }

}
