import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int a = scanner.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int b = scanner.nextInt();

        System.out.println("Sonuç: " + power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }

        return a * power(a, b-1);
    }
}
