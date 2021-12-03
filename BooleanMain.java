import java.util.Scanner;

public class BooleanMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int number1 = scanner.nextInt();
        final int number2 = scanner.nextInt();
        scanner.close();

        System.out.printf("Number1 : %d, Number2 : %d%n",number1,number2);

        boolean oneGrtTwo = number1 > number2;
        System.out.printf("Number1 > Number2 ? %b%n",oneGrtTwo);

        boolean oneSmlTwo = number1 < number2;
        System.out.printf("Number1 < Number2 ? %b%n",oneSmlTwo);

        boolean oneEqlTwo = number1 == number2;
        System.out.printf("Number1 == Number2 ? %b%n",oneEqlTwo);
    }
}
