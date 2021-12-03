import java.util.Locale;
import java.util.Scanner;

public class StringCompareMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final String str1 = scanner.nextLine();
        final String str2 = scanner.nextLine();
        scanner.close();

        String str2Lower = str2.toLowerCase();
        String str1fun = str1.replace("easy", "fun");

        if (str1.equals(str2))
            System.out.println("true");
        else
            System.out.println("false");

        if (str1.equalsIgnoreCase(str2))
            System.out.println("true");
        else
            System.out.println("false");

        if (str1.equals(str2Lower))
            System.out.println("true");
        else
            System.out.println("false");

        if (str1fun.equalsIgnoreCase(str2))
            System.out.println("true");
        else
            System.out.println("false");
    }
}