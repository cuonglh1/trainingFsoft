package OOP_Bai7;

public class Teacher extends Person {

    private double salary;
    private double bonus;
    private double penaty;
    private double realSalary;

    public Teacher(){
        super();
    }

    public Teacher(String id, String name, int age, String address, double salary, double bonus, double penaty, double realSalary) {
        super(id, name, age, address);
        this.salary = salary;
        this.bonus = bonus;
        this.penaty = penaty;
        this.realSalary = realSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenaty() {
        return penaty;
    }

    public void setPenaty(double penaty) {
        this.penaty = penaty;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", bonus=" + bonus +
                ", penaty=" + penaty +
                ", realSalary=" + realSalary +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
