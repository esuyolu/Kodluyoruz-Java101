import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        // Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        /*int a, b;
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = scanner.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = scanner.nextInt();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs : " + c);*/

        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
        int a, b, c, u;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz : ");
        a = scanner.nextInt();
        System.out.print("2. Kenarı Giriniz : ");
        b = scanner.nextInt();
        System.out.print("3. Kenarı Giriniz : ");
        c = scanner.nextInt();

        u = (a + b + c) / 2;
        area = Math.sqrt( u * (u -a ) * (u - b) * (u - c));
        System.out.println("Üçgenin Alanı : " + area);
    }
}
