import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        int r, alpha;
        double pi = 3.14;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = scanner.nextInt();
        System.out.print("Daire Diliminin Açısını Giriniz: ");
        alpha = scanner.nextInt();

        double alan = pi * r * r;
        double cevre = 2 * pi * r;
        double dilimAlan = pi * r * r * alpha / 360;
        double dilimCevre = 2 * pi * r * alpha / 360;

        System.out.println("Dairenin Alanı : " + alan);
        System.out.println("Dairenin Çevresi : " + cevre);
        System.out.println("Daire Diliminin Alanı : " + dilimAlan);
        System.out.println("Daire Diliminin Çevresi : " + dilimCevre);
    }
}
