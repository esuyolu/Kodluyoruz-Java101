import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        int num, fact4 = 1, fact5 = 1, i = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı: ");
        num = scanner.nextInt();

        while (fact4 < num && fact5 <num) {
            fact4 *= 4;
            fact5 *= 5;
            System.out.println("4'ün " + i + ". kuvveti: " + fact4 + " 5'in " + i + ". kuvveti: " + fact5);
            ++i;
        }
    }
}
