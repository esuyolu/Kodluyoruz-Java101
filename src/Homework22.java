import java.util.Scanner;

public class Homework22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n = scanner.nextInt();

        if (isPrime(n, 2)) {
            System.out.println(n + " sayısı ASALDIR!");
        } else {
            System.out.println(n + " sayısı ASAL değildir!");
        }
    }

    static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return n == 2;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }

        return isPrime(n, i + 1);
    }
}
