package OOP_Bai15.Exception;

public class FullNameException extends Exception {

    public FullNameException() {
        System.out.println("Nhap FullName co do dai hơn 10 kí tự và nhỏ hon 50 kí tự!");
    }

    public FullNameException(String s) {
        super(s);
        System.out.println("Nhap FullName co do dai lớn  hơn  bằng 10 kí tự và nhỏ hon 50 kí tự!");
    }
}
