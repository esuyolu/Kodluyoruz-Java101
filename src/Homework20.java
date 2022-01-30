import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci dizisi kaç elamanlı olacak? ");
        int n = scanner.nextInt();

        int prev1 = 0, prev2 = 1, result = 0;
        System.out.print(prev2 + " ");
        for (int i = 2; i <= n; ++i) {
            result = prev1 + prev2;
            System.out.print(result + " ");
            prev1 = prev2;
            prev2 = result;
        }
    }
}
