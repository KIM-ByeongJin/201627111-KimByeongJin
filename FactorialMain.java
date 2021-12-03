import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        final int num = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= num; i++){
            long fact = getFactorial(i);
            System.out.println("Factorial of " + i + " = " + fact);
        }

    }
    private static long getFactorial(final int n){
        long fact = 1;
        for(long init = 1; init <= (long) n; init++){
            fact *= init;
        }
        return fact;
    }
}
