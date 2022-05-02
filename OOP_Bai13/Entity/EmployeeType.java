package OOP_Bai13.Entity;

public enum EmployeeType {
    EXPERIENCE(0),
    FRESHER(1),
    INTERN(2);

    private int value;

    private EmployeeType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static EmployeeType valueOfEnum(int value) {
        for (EmployeeType employeeType : values()) {
            if (employeeType.getValue() == value) {
                return employeeType;
            }
        }
        return null;

    }

    public static void main(String[] args) {
        EmployeeType experience = EmployeeType.EXPERIENCE;
        System.out.println(EmployeeType.valueOfEnum(0));
        System.out.println(experience + " " + experience.getValue());
        for (EmployeeType employeeType : values()) {
            System.out.println(employeeType.getValue());
        }
    }
}
