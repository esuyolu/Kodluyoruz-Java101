import java.util.Scanner;

public class Homework23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        pattern(n);
    }

    static void pattern(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        pattern(num - 5);
        System.out.print(num + " ");
    }
}

