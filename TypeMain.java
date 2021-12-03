import java.util.Scanner;

public class TypeMain {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String input = scanner.nextLine();

        printType(input);
        int strToInt = Integer.valueOf(input);
        System.out.println("Type conversion to int...");
        printType(strToInt);
        float intToFlt = (float) strToInt;
        System.out.println("Type conversion int to float...");
        printType(intToFlt);

    }

    private static void printType(String x) {
        System.out.println(x + " is a string");
    }
    private static void printType(int x) {
        System.out.println(x + " is an int");
    }
    private static void printType(float x) {
        System.out.println(x + " is a float");
    }
}