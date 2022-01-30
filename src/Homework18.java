import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak Sayısı: ");
        int n = scanner.nextInt();
        int val = n;

        for (int k = 1; k <= n; ++k) {
            for (int i = (2 * val - 1); i > 0; --i) {
                System.out.print("*");
            }
            System.out.println();
            for (int j = 1; j <= k; ++j) {
                System.out.print(" ");
            }
            --val;
        }
    }
}
