import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        int mat, fzk, kmy, tkc, trh, mzk;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik Notunuz: ");
        fzk = scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        kmy = scanner.nextInt();

        System.out.print("Türkçe Notunuz: ");
        tkc = scanner.nextInt();

        System.out.print("Tarih Notunuz: ");
        trh = scanner.nextInt();

        System.out.print("Müzik Notunuz: ");
        mzk = scanner.nextInt();

        int toplam = (mat + fzk + kmy + tkc + trh + mzk);
        double sonuc = toplam / 6.0;
        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
