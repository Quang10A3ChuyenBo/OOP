import java.util.Scanner;
import java.util.Arrays;
public class TetrisGrid {
    private int[][] grid;
    public static void clearRows(int rows, int cols, int[][] grid) {

        for (int i = rows - 1; i >= 0; i--) {
            boolean isRowComplete = true;
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 0) {
                    isRowComplete = false;
                    break;
                }
            }
            if (isRowComplete) {
                for (int k = i; k > 0; k--) {
                    System.arraycopy(grid[k - 1], 0, grid[k], 0, cols);
                }
                Arrays.fill(grid[0], 0);
            }
        }
    }

    public static void ReturnGrid(int[][] grid,int rows,int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] grid = new int[rows+5][cols+5];
        scanner.nextLine();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        clearRows(rows,cols,grid);
        ReturnGrid(grid,rows,cols);
    }
}
