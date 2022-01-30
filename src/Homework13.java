public class Homework13 {
    public static void main(String[] args) {
        for (int n = 0; n <= 999999; ++n)
            if (isArmstrong(n))
                System.out.println(n);
    }

    public static boolean isArmstrong(int val)
    {
        if (val < 0)
            return false;

        int count = getDigitsCount(val);
        int sum = 0;
        int temp = val;

        while (temp != 0) {
            sum += pow(temp % 10, count);
            temp /= 10;
        }

        return sum == val;
    }

    public static int getDigitsCount(int val)
    {
        int count = 0;

        do {
            ++count;
            val /= 10;
        } while (val != 0);

        return count;
    }

    public static int pow(int a, int b)
    {
        b = Math.abs(b);

        int result = 1;

        while (b-- > 0)
            result *= a;

        return result;
    }
}
