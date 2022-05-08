import java.util.Arrays;
import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i=0; i < n; ++i) {
            System.out.print((i + 1) + ". Elemanı : ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Sıralama : " + Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] source) {
        int len = source.length;
        int temp;

        for (int i = 0; i < len; ++i) {
            for (int j = (i + 1); j < len; ++j) {
                if (source[j] < source[i]) {
                    temp = source[j];
                    source[j] = source[i];
                    source[i] = temp;
                }
            }
        }

        return source;
    }
}
