import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice11 {
    public static void main(String[] args) {
        int[] list = {3, 24, 7, -6, 3, 4, 3, 2, 9, 10, 24, 21, 1, 33, 9, 1, 2, 4, -6, 8, 24};

        System.out.println(repeatingEvenNumbers(list));
    }

    public static Set<Integer> repeatingEvenNumbers(int[] numberArray) {
        List<Integer> list = new ArrayList<>();
        for (int i : numberArray) {
            list.add(i);
        }

        return list.stream().filter(i -> (Collections.frequency(list, i) > 1) && (i % 2 == 0)).collect(Collectors.toSet());
    }
}
