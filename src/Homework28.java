import java.util.Scanner;

public class Homework28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Matristeki satır sayısı : ");
        int row = scanner.nextInt();
        System.out.print("Matristeki sütun sayısı : ");
        int col = scanner.nextInt();

        int[][] a = new int[row][col];

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                System.out.print("a[" + i + "][" + j + "] : ");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matris : ");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

        a = transpose(a);
        System.out.println("Transpoze : ");
        for (int[] ints : a) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int [][] a) {
        int row = a[0].length;
        int col = a.length;

        int[][] b = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                b[i][j] = a[j][i];
            }
        }

        return b;
    }
}
