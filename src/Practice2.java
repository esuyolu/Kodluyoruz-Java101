import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ücret tutarını Giriniz : ");
        tutar = scanner.nextDouble();
        kdvOran = tutar > 0 && tutar < 1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV Oranı : " + kdvOran);
        System.out.println("KDV Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);
    }
}
