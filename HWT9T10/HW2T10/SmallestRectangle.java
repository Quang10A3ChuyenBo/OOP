import java.util.Scanner;

public class SmallestRectangle {

    public static int smallestRectangleArea(char[][] matrix, char ch) {
        int mix = Integer.MAX_VALUE;
        int miy = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        int my = Integer.MIN_VALUE;

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] == ch) {
                    mix = Math.min(mix, i);
                    miy = Math.min(miy, j);
                    mx = Math.max(mx, i);
                    my = Math.max(my, j);
                }
            }
        }

        if (mix == Integer.MAX_VALUE) {
            return 0;
        }

        int length = mx - mix + 1;
        int width = my - miy + 1;

        return length * width;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] matrix = new char[rows+5][columns+5];
        scanner.nextLine();
        for (int i = 0; i < rows; i++) {
                String input = scanner.nextLine();
                //System.out.println(i);
                //System.out.println(input);
                for (int j = 0; j < input.length(); j++) {
                    matrix[i][j] = input.charAt(j);
                }
        }
        //System.out.println("phan chia");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        for (char i = 'a'; i <= 'z';i++)  {
            int x = smallestRectangleArea(matrix, i);
            System.out.print(i+" ");
            System.out.println(x);
        }

        //System.out.println(area);
        scanner.close();
    }
}
