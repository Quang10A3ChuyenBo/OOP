import java.util.Scanner;
public class PlusPattern {
    private static boolean CheckPattern(char[][] table, int x, int y,int len) {
        if (x < 0 || y < 0 || x >= table.length+1 || y >= table[0].length+1) {
            return false;
        }

        char center = table[x][y];

        int rightLen = 0;
        for (int i = y + 1; i < table[0].length; i++) {
            if (table[x][i] == center) {
                rightLen++;
            } else {
                break;
            }
        }

        int leftLen = 0;
        for (int i = y - 1; i >= 0; i--) {
            if (table[x][i] == center) {
                leftLen++;
            } else {
                break;
            }
        }


        int downLen = 0;
        for (int i = x + 1; i < table.length; i++) {
            if (table[i][y] == center) {
                downLen++;
            } else {
                break;
            }
        }

        int upLen = 0;
        for (int i = x - 1; i >= 0; i--) {
            if (table[i][y] == center) {
                upLen++;
            } else {
                break;
            }
        }

        return leftLen >= len && rightLen >= len && upLen >= len && downLen >= len && leftLen == rightLen && upLen == downLen;
    }

    public static int countPlus(char[][] table) {
        int count = 0;
        int len = 2;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                if (CheckPattern(table, i, j, len)) {
                    count++;

                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        char[][] table = new char[rows+5][columns+5];
        scanner.nextLine();
        for (int i = 0; i < rows; i++) {
            String input = scanner.nextLine();
            //System.out.println(i);
            //System.out.println(input);
            for (int j = 0; j < input.length(); j++) {
                table[i][j] = input.charAt(j);
            }
        }
        int ans = countPlus(table);
        System.out.println(ans);
    }
}
