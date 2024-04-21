import java.util.HashSet;
import java.util.Scanner;
public class HashSett {
    public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= a.length() - len; i++) {
            set.add(a.substring(i, i + len));
        }

        for (int i = 0; i <= b.length() - len; i++) {
            if (set.contains(b.substring(i, i + len))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        String b = scanner.nextLine();
        int len =  scanner.nextInt();

        if (stringIntersect(a, b, len)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        scanner.close();
    }

}
