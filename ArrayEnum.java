import java.util.Scanner;

enum Command {ADD, SUM, AVG, STD, LIST, QUIT, INVALID};
public class ArrayEnum {
    public static void main(String[] args) {
        final int MAX = 100;
        int [] values = new int[MAX];
        int index = 0;
        boolean flag = true;

        final Scanner scanner = new Scanner(System.in);
        while (true) {
            final Command command = getCommand(scanner);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case SUM:
                    System.out.printf("%d%n", getSum(values,index));
                    break;
                case AVG:
                    System.out.printf("%.2f%n", getAvg(values,index));
                    break;
                case STD:
                    System.out.printf("%.2f%n", getStd(values,index));
                    break;
                case LIST:
                    printList(values,index);
                    break;
                case INVALID:
                    if (flag) {
                        System.out.println("Invalid Command");
                        flag = false;
                    }
                    else
                        flag = true;
                    break;
                default:
                    break;
            }
        }
        scanner.close();
    }
    private static Command getCommand(Scanner scanner) {
        final String commandName = scanner.next();
        Command command;
        try {
            command = Command.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            command = Command.INVALID;
        }
        return command;
    }
    private static Integer getValue(Scanner scanner) {
        final int number = scanner.nextInt();
        int value = number;
        return value;
    }
    private static int getSum(int[] values, int index) {
        int sum = 0;
        for (int i = 0; i< index; i++) {
            sum += values[i];
        }
        return sum;
    }
    private static double getAvg(int[] values, int index) {
        int sum = getSum(values, index);
        double avg;
        avg = (double)sum / (double)index;
        return avg;
    }
    private static double getStd(int[] values, int index) {
        int [] valueSqr = new int[index];
        for (int i = 0; i<index;i++)
            valueSqr[i] = values[i]*values[i];
        double sqrAvg = getAvg(valueSqr, index);
        double avg = getAvg(values, index);
        double std = sqrAvg - avg*avg;
        return Math.sqrt(std);
    }
    private static void printList(int[] values, int index) {
        for(int i=0; i<index; i++)
            System.out.print(values[i] + " ");
        System.out.printf("%n");
    }
}
