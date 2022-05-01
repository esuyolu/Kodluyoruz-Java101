import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        List<Integer> minList = new ArrayList<>();
        List<Integer> maxList = new ArrayList<>();

        System.out.print("Sayı: ");
        int num = scanner.nextInt();

        int diffMin1 = Integer.MAX_VALUE, diffMin2 = Integer.MAX_VALUE, diff;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i : list) {
            if (i < num) {
                minList.add(i);
            } else {
                maxList.add(i);
            }
        }

        for (int i : minList) {
            diff = Math.abs(i - num);
            if (diff < diffMin1){
                diffMin1 = diff;
                min = i;
            }
        }

        for (int i : maxList) {
            diff = Math.abs(i - num);
            if (diff < diffMin2){
                diffMin2 = diff;
                max = i;
            }
        }

        System.out.println("Girilen Sayı : " + num);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
