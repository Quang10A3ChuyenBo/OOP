import java.util.Scanner;

public class maxRun {
    public static int solve(String s) {
        int maxLength = 0;
        int count = 1;
        char[] chars = s.toCharArray();
        //System.out.print(s);
        for (int i = 0; i < chars.length-1; i++) {
            //System.out.print(chars[i]+" ");
            if (chars[i] == chars[i+1]) {
                count++;
            } else {
                maxLength = Math.max(maxLength, count);
                count = 1;
            }
        }
        //System.out.println(count);
        maxLength = Math.max(maxLength, count);
        return maxLength;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Integer output = solve(input);
        System.out.println(output);
    }
}
