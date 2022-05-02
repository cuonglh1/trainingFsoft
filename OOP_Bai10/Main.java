package OOP_Bai10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VanBan v = new VanBan();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Application Manager Khach Hang");
            System.out.println("Enter 1: Dem so tu của Van bản");
            System.out.println("Enter 2: Dem ki tu A trong văn bản: ");
            System.out.println("Enter 3: chuan hoa van ban: ");
            System.out.println("Enter 4: To exit:");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhap noi dung văn ban");
                    String s = scanner.nextLine();
                    v.setS(s);
                    int count = v.countWords(s);
                    System.out.println("So tu của van ban: " + count);
                    break;

                }
                case "2":
                    System.out.println("Nhap noi dung văn ban");
                    String s = scanner.nextLine();
                    int count = v.countcharA(s);
                    System.out.println("So ki tu A trong van ban: " + count);
                    break;

                case "3":
                    System.out.println("Nhap noi dung văn ban");
                    String input = scanner.nextLine();
                    v.chuanhoachuoi(input);
                    System.out.println(v.toString());
                    break;

                case "4":
                    return;

            }
        }
    }
}
