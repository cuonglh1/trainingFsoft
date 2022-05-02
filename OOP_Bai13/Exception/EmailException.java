package OOP_Bai13.Exception;

public class EmailException extends Exception {

    public EmailException() {
        System.out.println("Email không hợp lệ!");
    }
    public EmailException(String s) {
        super(s);
        System.out.println("Email không hợp lệ!");
    }
}
