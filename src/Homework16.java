import java.util.Scanner;

public class Homework16 {
    public static void main(String[] args) {
        int num, max, min;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = scanner.nextInt();

        // i = 1
        System.out.print("1. sayı: ");
        num = scanner.nextInt();
        min = num;
        max = num;

        for (int i = 2; i <= n; ++i) {
            System.out.print(i + ". sayı: ");
            num = scanner.nextInt();

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
