import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vui lòng nhập 9 ký tự:");

        String input = scanner.next().substring(0, 9);

        System.out.println("Bạn đã nhập: " + input);
    }
}
