public class Palindrome {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String s = "";
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) s = s + i + s;
            else            s = i + s + i;
        }
        System.out.println(s);
    }
}