package OOP_Bai13.Exception;

public class FullNameException extends Exception {

    public FullNameException() {
        System.out.println("Nhap FullName co do dai hơn 3 kí tự!");
    }

    public FullNameException(String s) {
        super(s);
        System.out.println("Nhap FullName co do dai hơn 3 kí tự!");
    }
}
