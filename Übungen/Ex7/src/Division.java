import java.util.Scanner;

public class Division {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        readInput();
    }

    private static void readInput() {        
        System.out.println("Geben Sie den Dividend ein: ");
        int dividend = scanner.nextInt();
        System.out.println("Geben Sie den Divisor ein: ");
        int divisor = scanner.nextInt();
        divide(dividend, divisor);
    }

    private static void divide(int dividend, int divisor) {
        try {
            int quotient = dividend / divisor;
            System.out.println("Der Quotient ist: " + quotient);
        } catch (ArithmeticException e) {
            System.out.println("Division durch 0 ist nicht erlaubt!");
        } finally {
            System.out.println("Möchten Sie eine neue Division durchführen? (j/n)");
            String input = scanner.next();
            if (input.equals("j")) {
                readInput();
            } else {
                System.out.println("Programm wird beendet.");
                scanner.close();
            }
        }
    }
}
