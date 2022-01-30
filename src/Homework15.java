import java.util.Scanner;

public class Homework15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1.sayı: ");
        int a = scanner.nextInt();
        System.out.print("2.sayı: ");
        int b = scanner.nextInt();

        int counter = (a < b ? a : b);
        int i = 2, divisor = 2;

        // ebob
        while (i <= counter) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
            ++i;
        }

        System.out.println("EBOB(" + a + ", " + b + ")= " + divisor);

        // ekok: (a*b)/ebob
        System.out.println("EKOK(" + a + ", " + b + ")= " + (a * b) / divisor);
    }
}
