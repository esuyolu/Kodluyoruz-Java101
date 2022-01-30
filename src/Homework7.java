import java.util.Scanner;

public class Homework7 {
    public static void main(String[] args) {
        double unitPrice = 0.1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        int km = scanner.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        int age = scanner.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        int type = scanner.nextInt();

        double totalPrice = unitPrice * km;

        if (km <= 0 || age <= 0 || type < 1 || type > 2) {
            System.out.println("Hatalı veri girdiniz!");
            System.exit(-1);
        }
        if (age < 12) {
            totalPrice *= 0.5;
        } else if (age < 24) {
            totalPrice *= 0.9;
        } else if (age > 65) {
            totalPrice *= 0.7;
        }
        if (type == 2) {
            totalPrice *= 1.6;
        }

        System.out.print("Ödenecek Ücret: " + totalPrice);
    }
}
