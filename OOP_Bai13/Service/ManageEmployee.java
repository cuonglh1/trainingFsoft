package OOP_Bai13.Service;

import OOP_Bai13.Entity.Employee;
import OOP_Bai13.Entity.Experience;
import OOP_Bai13.Entity.Fresher;
import OOP_Bai13.Entity.Intern;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManageEmployee {
    List<Employee> employees;

    public ManageEmployee() {
        employees = new ArrayList<>();
    }

    public Employee insert(Employee employee) {
        Employee.count++;
        this.employees.add(employee);
        return employee;
    }

    public Employee findById(String id) {
        return this.employees.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public Employee update(Employee employee) {
        Employee e = findById(employee.getId());
        if(e == null) {
            System.out.println("Nhan vien ko ton tai trong he thong");
            return e;
        }
        deleteById(employee.getId());
        this.employees.add(employee);
        return  employee;
    }

    public boolean deleteById(String id) {
        Employee employee = this.findById(id);
        if (employee == null) {
            return false;
        }
        this.employees.remove(employee);
        return true;
    }

    /**
     * type = 0 => Experience
     * type = 1 => Fresher
     * type = 2 => Intern
     */
    public List<Employee> findByType(int type) {
        return this.employees.stream()
                .filter(employee -> {
                    if (type == 0) {
                        return employee instanceof Experience;
                    }
                    if (type == 1) {
                        return employee instanceof Fresher;
                    }
                    if (type == 2) {
                        return employee instanceof Intern;
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public List<Employee> findAll() {
        return this.employees;
    }

}
