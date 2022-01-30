import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı: ");
        num = scanner.nextInt();

        while (num % 2 == 0) {
            if (num % 4 == 0) {
                sum += num;
            }
            System.out.print("Sayı: ");
            num = scanner.nextInt();
        }

        System.out.print("Sonuç: " + sum);
    }
}
