package OOP_Bai14.Exception;

public class PhoneException extends Exception {
    public PhoneException() {
        System.out.println("Phpne không hợp lệ!");
    }

    public PhoneException(String s) {
        super(s);
        System.out.println("Phone không hợp lệ!");
    }
}
