package OOP_Bai14.Util;

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

    public static boolean phoneCheck(String phone) {
        // TODO HERE

        // Bieu thuc chinh quy mo ta dinh dang so dien thoai
        String reg = "^(090||091||098||031||035||036||038||039)?(\\d{7})$";
        if (!phone.matches(reg)) {
            return false;
        }
        return true;
    }

    public static boolean nameCheck(String name) {
        // TODO HERE

        if (StringUtils.isEmpty(name) || name.length() < 10 || name.length() > 50) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String phone = "0982345679";
        String birthday = "32/02/1997";
        System.out.println(Validator.phoneCheck(phone));
        Validator.birthdayCheck(birthday);
        System.out.println(Validator.birthdayCheck(birthday));

    }
}
