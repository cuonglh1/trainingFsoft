package OOP_Bai15.Exception;

public class BirthDayException extends Exception {

    public BirthDayException() {
        System.out.println("BirthDay inValid!");
    }

    public BirthDayException(String s) {
        super(s);
        System.out.println("BirthDay inValid!");
    }
}
