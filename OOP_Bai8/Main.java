package OOP_Bai8;

import OOP_Bai1.ManagerOfficer;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ManagerCard managerCard = new ManagerCard();
        while (true) {
            System.out.println("Application Manager Cards");
            System.out.println("Enter 1: To insert Card");
            System.out.println("Enter 2: To  delete by CardId: ");
            System.out.println("Enter 3: To show information Card");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    Student student = importInforStudent();
                    System.out.println("Ngay muon: ");
                    int borrowDate = Integer.valueOf(scanner.nextLine());
                    int paymentDate;
                    do {
                        System.out.println("Ngay tra: ");
                        paymentDate = Integer.valueOf(scanner.nextLine());
                    }
                    while (paymentDate < borrowDate);

                    System.out.println("Enter BookId: ");
                    Long bookId = Long.valueOf(scanner.nextLine());
                    Card card = new Card(student, borrowDate, paymentDate, bookId);
                    managerCard.add(card);
                    break;
                }
                case "2":
                    System.out.println("Enter cardId: ");
                    String cardId = scanner.nextLine();
                    managerCard.delete(cardId);
                    break;

                case "3":
                    managerCard.showInforCards();
                    break;

                case "4":
                    return;

                default:
                    System.out.println("Not Valid");
                    break;

            }

        }


    }

    private static Student importInforStudent() {
        System.out.println("Nhap thong tin Sinh vien: ");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter age: ");
        int age = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter class: ");
        String clazz = scanner.nextLine();
        Student student = new Student(name, age, clazz);
        return student;
    }

}
