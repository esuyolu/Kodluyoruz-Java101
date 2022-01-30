import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = scanner.nextInt();

        boolean isLeapYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır!");
        } else {
            System.out.println(year + " bir artık yıl değildir!");
        }
    }
}
