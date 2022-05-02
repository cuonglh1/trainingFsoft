package OOP_Bai8;

import java.util.UUID;

public class Card {
    private Student student;
    private String id;
    private int borrowDate;
    private int paymentDate;
    private Long bookId;

    public Card(Student student, int borrowDate, int paymentDate, Long bookId) {
        this.student = student;
        this.id = UUID.randomUUID().toString();
        this.borrowDate = borrowDate;
        this.paymentDate = paymentDate;
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(int paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "Card{" +
                "student=" + student +
                ", id= " + id  +
                ", borrowDate=" + borrowDate +
                ", paymentDate=" + paymentDate +
                ", bookId=" + bookId +
                '}';
    }
}
