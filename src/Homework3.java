import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int number1, number2, select;
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        number1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        number2 = scanner.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Çarpma: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
                    System.out.println("Bölme: " + (number1 / number2));
                } else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            default:
                System.out.println("Geçersiz İşlem!");
        }

    }
}
