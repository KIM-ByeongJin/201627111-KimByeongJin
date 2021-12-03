import java.util.Scanner;

public class MathMain {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a begin number: ");
        final int begin = scanner.nextInt();
        System.out.println("Enter an end number: ");
        final int end = scanner.nextInt();
        scanner.close();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }

    private static long getSumBetween(int x, int y) {
        long sum = 0;
        for (long init = (long) x; init < (long) y + 1; init++){
            sum+= init;
        }
        return sum;
    }

    private static long getProductBetween(int x, int y) {
        long product = 1;
        for (long init = (long) x; init < (long) y + 1; init++){
            product*= init;
        }
        return product;
    }

}
