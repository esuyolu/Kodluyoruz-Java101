import java.util.Scanner;

public class Homework17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num / 2; ++i) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (num == sum)
            System.out.println(num + " Mükemmel sayıdır.");
        else
            System.out.println(num + " Mükemmel sayı değildir.");
    }
}
