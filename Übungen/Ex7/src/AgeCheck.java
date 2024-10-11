import java.util.Scanner;

public class AgeCheck {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int age = readAge();
        checkAge(age);   
    }

    private static int readAge() {
        System.out.println("Geben Sie Ihr Alter ein: ");
        int age = scanner.nextInt();
        return age;
    }

    private static void checkAge(int age) {
        try {
            if (age < 0) {
                throw new InvalidAgeException("Das Alter darf nicht negativ sein!");
            } else if (age < 18) {
                throw new InvalidAgeException("Sie sind noch nicht volljährig!");
            } else if (age > 120) {
                throw new InvalidAgeException("Sie sind zu alt!");
            } else {
                System.out.println("Sie sind volljährig.");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programm wird beendet.");
            scanner.close();
        }
    }

}
