import java.util.HashMap;

public class Homework27 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int count;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int k : arr) {
            count = 0;
            for (int i : arr) {
                if (k == i) {
                    ++count;
                }
            }
            freq.put(k, count);
        }

        System.out.println("Tekrar Sayıları");
        for (Integer i : freq.keySet()) {
            System.out.println(i + " sayısı " + freq.get(i) + " kez tekrar edildi.");
        }
    }
}
