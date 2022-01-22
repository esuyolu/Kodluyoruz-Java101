import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;
        int armutMiktar, elmaMiktar, domatesMiktar, muzMiktar, patlicanMiktar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        armutMiktar = scanner.nextInt();
        System.out.print("Elma Kaç Kilo ? :");
        elmaMiktar = scanner.nextInt();
        System.out.print("Domates Kaç Kilo ? :");
        domatesMiktar = scanner.nextInt();
        System.out.print("Muz Kaç Kilo ? :");
        muzMiktar = scanner.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? :");
        patlicanMiktar = scanner.nextInt();

        double tutar = armut * armutMiktar + elma * elmaMiktar + domates * domatesMiktar + muz * muzMiktar + patlican * patlicanMiktar;
        System.out.println("Toplam Tutar : " + tutar + " TL");
    }
}
