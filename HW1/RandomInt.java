import java.util.Scanner;

public class RandomInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double r = Math.random();
        int value = (int) (r * n);

        System.out.println(value);
        System.out.println(r);
    }
}
