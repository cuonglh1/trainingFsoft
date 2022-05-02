package OOP_Bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = Integer.valueOf(scanner.nextLine());
        for(int i = 0; i < n; i++) {

            // Input foreach famili
            System.out.println("Enter numberPerson: ");
            int numberPerson  = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter address:");
            String address = scanner.nextLine();

            // Enter person number in family
            List<Person> persons = new ArrayList<>();

            for (int j = 0; j < numberPerson; j++) {
                // Input person for family
                System.out.println("Enter name Person : ");
                String name = scanner.nextLine();
                System.out.println("Enter age: ");
                int age = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter job: ");
                String job = scanner.nextLine();
                System.out.println("Enter passport: ");
                String passport = scanner.nextLine();
                Person person = new Person();
                person.setName(name);
                person.setAge(age);
                person.setJob(job);
                person.setPassport(passport);
                persons.add(person);

            }

            // After done input
            town.addFamily(new Family(numberPerson, address, persons));

        }
        System.out.println(town.toString());
    }
}
