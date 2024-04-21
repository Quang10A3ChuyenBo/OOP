import java.util.Scanner;

public class BlowUpo {
    public static String replaceDigits(String s) {
        char[] chars = s.toCharArray();
        String sn ="";
        for (int i = 0; i < chars.length-1; i++) {
            if (Character.isDigit(chars[i])) {
                int dem = Character.getNumericValue(chars[i]);
                //System.out.println(chars[i+1]);
                for (int j = 1; j <= dem; j++) {
                    sn = sn + chars[i+1];
                }
            }
            else sn = sn + chars[i];
        }
        return new String(sn).replaceAll("[0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = replaceDigits(input);
        System.out.println(output);
    }
}
