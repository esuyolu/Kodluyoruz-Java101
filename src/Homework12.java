import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args) {
        int res1 = 1, res2 = 1, res3 = 1, result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n= ");
        int n = scanner.nextInt();
        System.out.print("r= ");
        int r = scanner.nextInt();

        // n!
        for (int i = 1; i <= n; ++i) {
            res1 *= i;
        }

        // r!
        for (int i = 1; i <= r; ++i) {
            res2 *= i;
        }

        // (n-r)!
        for (int i = 1; i <= (n-r); ++i) {
            res3 *= i;
        }

        // C(n,r) = n! / (r! * (n-r)!)
        result = res1 / (res2 * res3);
        System.out.println("C(" + n + "," + r + ")= " + result);
    }
}
