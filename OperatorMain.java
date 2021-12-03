import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int dividend = scanner.nextInt();
        final int divisor = scanner.nextInt();
        scanner.close();

        float result = (float)dividend / (float)divisor;
        String rslt = String.format("%.03f",result);

        System.out.println(dividend + " / " + divisor + " = " + rslt);
        System.out.println(dividend + " = " + (dividend/divisor) + " x " + divisor + " + " + (dividend%divisor));
    }
}
