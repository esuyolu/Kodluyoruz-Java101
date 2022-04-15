import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        int number;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " Sayısı Palindromdur.");
        } else {
            System.out.println(number + " Sayısı Palindrom Değildir.");
        }
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = 0;
        int temp = number;

        while (temp != 0) {
            reverseNumber = (temp % 10) + (reverseNumber * 10);
            temp /= 10;
        }
        System.out.println("Sayının Ters Hali: " + reverseNumber);

        return number == reverseNumber;
    }
}
