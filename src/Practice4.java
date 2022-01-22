import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total = 10.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : ");
        km = scanner.nextInt();

        total += km * perKm;
        total = total < 20 ? 20 : total;

        System.out.println("Toplam Tutar : " + total);
    }
}
