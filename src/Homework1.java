import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int weight;
        double height;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz :");
        height = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        weight = scanner.nextInt();

        double bmi = weight / (height * height);

        System.out.println("Vücut Kitle İndeksiniz :" + bmi);
    }
}
