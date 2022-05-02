package OOP_Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Application Manager Cards");
            System.out.println("Enter 1: To insert Student");
            System.out.println("Enter 2: To  show Students age equals 20");
            System.out.println("Enter 3: To  show count Students age equals 23 and address in DN");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter age: ");
                    int age = Integer.valueOf(scanner.nextLine());
                    System.out.println("Enter address: ");
                    String address = scanner.nextLine();
                    Student student = new Student(name, age, address);
                    school.add(student);
                    break;
                }
                case "2":
                    school.getStudent20YearOld().forEach(System.out::println);
                    break;
                    
                case "3":
                    System.out.println(school.countStudent23YearOldInDN());
                    break;

                case "4":
                    return;

                default:
                    System.out.println("inValid");
                    break;

            }
        }
    }
}
