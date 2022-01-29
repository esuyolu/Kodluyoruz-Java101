import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("1.sayı: ");
        a = scanner.nextInt();

        System.out.print("2.sayı: ");
        b = scanner.nextInt();

        System.out.print("3.sayı: ");
        c = scanner.nextInt();

        if (a < b)
            if (b < c)
                System.out.printf("%d < %d < %d", a, b, c);
            else if (b == c)
                System.out.printf("%d < %d = %d", a, b, c);
            else if (a < c)
                System.out.printf("%d < %d < %d", a, c, b);
            else if (a == c)
                System.out.printf("%d = %d < %d", a, c, b);
            else
                System.out.printf("%d < %d < %d", c, a, b);
        else if (b < a)
            if (c < b)
                System.out.printf("%d < %d < %d", c, b, a);
            else if (c == b)
                System.out.printf("%d = %d < %d", c, b, a);
            else if (a < c)
                System.out.printf("%d < %d < %d", b, a, c);
            else if (a == c)
                System.out.printf("%d < %d = %d", b, a, c);
            else
                System.out.printf("%d < %d < %d", b, c, a);
        else if (a < c)
            System.out.printf("%d = %d < %d", a, b, c);
        else if (a == c)
            System.out.printf("%d = %d = %d", a, b, c);
        else
            System.out.printf("%d < %d = %d", c, a, b);
    }
}
