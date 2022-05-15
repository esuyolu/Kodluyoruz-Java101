import java.util.Random;
import java.util.Scanner;

public class ProjectMineSweeper {
    private int rowNumber;
    private int colNumber;
    private String[][] matrix;
    String[][] newArray;
    int[][] arr;

    public ProjectMineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        matrix = new String[rowNumber][colNumber];
        arr = new int[rowNumber][colNumber];
        newArray = new String[rowNumber][colNumber];
    }

    public void run() {
        initializeMatrix();
        placeMines();
        display(matrix);
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        display(newArray);
        game();
    }

    private void initializeMatrix() {
        for (int i = 0; i < rowNumber; ++i) {
            for (int j = 0; j < colNumber; ++j) {
                matrix[i][j] = "-";
                newArray[i][j] = "-";
            }
        }
    }

    private void placeMines() {
        int count = (rowNumber * colNumber) / 4;

        while (count > 0) {
            Random random = new Random();
            int x = random.nextInt(rowNumber);
            int y = random.nextInt(colNumber);
            if (matrix[x][y].equals("*")) {
                continue;
            }
            matrix[x][y] = "*";
            --count;
        }
    }

    private void clue(int i, int j) {
        int count = 0;

        if (i == 0 && j == 0) {
            if (matrix[i][j+1].equals("*")) {
                ++count;
            }
            if (matrix[i+1][j].equals("*")) {
                ++count;
            }
            if (matrix[i+1][j+1].equals("*")) {
                ++count;
            }
        } else if (i == 0 && j == (colNumber-1)) {
            if (matrix[i][j-1].equals("*")) {
                ++count;
            }
            if (matrix[i+1][j-1].equals("*")) {
                ++count;
            }
            if (matrix[i+1][j].equals("*")) {
                ++count;
            }
        } else if (i == (rowNumber-1) && j == 0) {
            if (matrix[i-1][j].equals("*")) {
                ++count;
            }
            if (matrix[i-1][j+1].equals("*")) {
                ++count;
            }
            if (matrix[i][j+1].equals("*")) {
                ++count;
            }
        } else if (i == (rowNumber-1) && j == (colNumber-1)) {
            if (matrix[i-1][j-1].equals("*")) {
                ++count;
            }
            if (matrix[i-1][j].equals("*")) {
                ++count;
            }
            if (matrix[i][j-1].equals("*")) {
                ++count;
            }
        } else if (i == 0) {
            for (int row = i; row <= (i+1); ++row) {
                for (int col = (j-1); col <= (j+1); ++col) {
                    if (row == i && col == j) {
                        continue;
                    }
                    if (matrix[row][col].equals("*")) {
                        ++count;
                    }
                }
            }
        } else if (i == (rowNumber-1)) {
            for (int row = (i-1); row <= i; ++row) {
                for (int col = (j-1); col <= (j+1); ++col) {
                    if (row == i && col == j) {
                        continue;
                    }
                    if (matrix[row][col].equals("*")) {
                        ++count;
                    }
                }
            }
        } else if (j == 0) {
            for (int row = (i-1); row <= (i+1); ++row) {
                for (int col = j; col <= (j+1); ++col) {
                    if (row == i && col == j) {
                        continue;
                    }
                    if (matrix[row][col].equals("*")) {
                        ++count;
                    }
                }
            }
        } else if (j == (colNumber-1)) {
            for (int row = (i-1); row <= (i+1); ++row) {
                for (int col = (j-1); col <= j; ++col) {
                    if (row == i && col == j) {
                        continue;
                    }
                    if (matrix[row][col].equals("*")) {
                        ++count;
                    }
                }
            }
        } else {
            for (int row = (i-1); row <= (i+1); ++row) {
                for (int col = (j-1); col <= (j+1); ++col) {
                    if (row == i && col == j) {
                        continue;
                    }
                    if (matrix[row][col].equals("*")) {
                        ++count;
                    }
                }
            }
        }
        arr[i][j] = count;
    }

    private void game() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while(true) {
            System.out.print("Satır giriniz : ");
            int pointX = scanner.nextInt();
            System.out.print("Sütun giriniz : ");
            int pointY = scanner.nextInt();


            if (pointX < 0 || pointX >= rowNumber || pointY < 0 || pointY >= colNumber) {
                System.out.println("Geçersiz koordinat !");
                break;
            }

            clue(pointX, pointY);

            if (matrix[pointX][pointY].equals("*")) {
                System.out.println("Game Over !");
                display(matrix);
                System.out.println("============================================");
                break;
            } else if (matrix[pointX][pointY].equals("-")) {
                if (count == ((rowNumber * colNumber) - ((rowNumber * colNumber) / 4))) {
                    newArray[pointX][pointY] = String.valueOf(arr[pointX][pointY]);
                    System.out.println("Oyunu Kazandınız !");
                    display(newArray);
                    System.out.println("********************************************");
                    display(matrix);
                    System.out.println("============================================");
                    break;
                }
                newArray[pointX][pointY] = String.valueOf(arr[pointX][pointY]);
                display(newArray);
                System.out.println("============================================");
                ++count;
            }
        }
    }

    private void display(String[][] matrix) {
        for (String[] sArray: matrix) {
            for (String s : sArray) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
