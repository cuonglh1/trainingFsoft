package OOP_Bai13.Util;

import OOP_Bai13.Exception.EmailException;
import OOP_Bai13.Exception.FullNameException;
import OOP_Bai13.Exception.PhoneException;
import org.springframework.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validator {

    public static boolean birthdayCheck(String birthday) {
        // TODO HERE
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(birthday, dateTimeFormatter);

        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public static boolean phoneCheck(String phone) throws PhoneException {
        // TODO HERE

        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(0)?(\\d{9})$";
        if (!phone.matches(reg)) {
            return false;
        }
        return true;
    }

    public static boolean emailCheck(String email) throws EmailException {
        // TODO HERE

        String emailPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

        if (!email.matches(emailPattern)) {
            return false;
        }
        return true;
    }

    public static boolean nameCheck(String name) throws FullNameException {
        // TODO HERE

        if (StringUtils.isEmpty(name) || name.length() < 3) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String phone = "0123456789";
        String birthday = "32/02/1997";
        try {
            Validator.phoneCheck(phone);
            Validator.birthdayCheck(birthday);
            System.out.println(Validator.birthdayCheck(birthday));
        } catch (PhoneException e) {
            System.out.println(e.getMessage());
        }

    }
}
