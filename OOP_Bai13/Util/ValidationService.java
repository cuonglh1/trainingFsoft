package OOP_Bai13.Util;

import OOP_Bai13.Entity.Employee;
import OOP_Bai13.Exception.BirthDayException;
import OOP_Bai13.Exception.EmailException;
import OOP_Bai13.Exception.FullNameException;
import OOP_Bai13.Exception.PhoneException;

public class ValidationService {

    public void checkData(Employee employee) throws EmailException, PhoneException,
            FullNameException, BirthDayException {
        if (!Validator.emailCheck(employee.getEmail())) {
            throw new EmailException("Email khong hop le: ");
        }

        if (!Validator.phoneCheck(employee.getPhone())) {
            throw new PhoneException("Phone khong dung dinh dang");
        }

        if (!Validator.nameCheck(employee.getFullName())) {
            throw new FullNameException("FullName phai lon hon 3 ki tu!");
        }
        if (!Validator.birthdayCheck(employee.getBirthday())) {
            throw new BirthDayException("BirthDay khong hop le (dd/MM/YYYY)!");
        }

    }
}
