import edu.princeton.cs.algs4.StdOut;
public class ReverseString {
    public static String reverse(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        for (int i = 0; i < n/2; i++) {
            char temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        return new String(a);
    }


    public static void main(String[] args) {
        StdOut.println(reverse(args[0]));
    }

}