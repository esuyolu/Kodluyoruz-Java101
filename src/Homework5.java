import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        int heat;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz: ");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat < 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz.");
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
