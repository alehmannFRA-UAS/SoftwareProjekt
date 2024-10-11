import java.util.Scanner;

public class Ex1 {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {        
        // Print numbers from 0 to 10
        System.out.println("### Print numbers from 0 to 10 ###");
        printNumbers0to10();
        System.out.println("\n### End of numbers from 0 to 10 ###\n");

        // Print numbers up to 100 divisible by 7
        System.out.println("### Print numbers up to 100 divisible by 7 ###");
        printNumbersUpTo100DivisibleBy7();
        System.out.println("\n### End of numbers up to 100 divisible by 7 ###\n");

        // Print text as often as defined by user input
        System.out.println("### Print text as often as defined by user input ###");
        printText();
        System.out.println("### End of text as often as defined by user input ###\n");

        // Check if a year is a leap year
        System.out.println("### Check if a year is a leap year ###");
        isLeapYear();
        System.out.println("### End of checking if a year is a leap year ###\n");
        
        // Count for each letter in a text how often it appears
        System.out.println("### Count for each letter in a text how often it appears ###");
        countLetters();
        System.out.println("\n### End of counting for each letter in a text how often it appears ###\n");

        // Count the vowels and consonants in a text
        System.out.println("### Count the vowels and consonants in a text ###");
        countVowelsAndConsonants();
        System.out.println("### End of counting the vowels and consonants in a text ###\n");

        // Print the first 1000 prime numbers
        System.out.println("### Print the first 1000 prime numbers (iterativ)###");
        int count = 0;
        for (int i = 2; count < 1000; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n### End of printing the first 1000 prime numbers (iterativ) ###\n");

        System.out.println("### Print the first 1000 prime numbers (rekursiv)###");
        int num = 0;
        for (int i = 2; num < 1000; i++) {
            if (isPrime(2, i)) {
                System.out.print(i + " ");
                num++;
            }
        }
        System.out.println("\n### End of printing the first 1000 prime numbers (rekursiv) ###\n");
    }

    private static void printNumbers0to10() {
        int i = 0;
        do {
            System.out.print(i + " ");
        } while (i++ < 10);
    }

    private static void printNumbersUpTo100DivisibleBy7() {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void printText() {
        System.out.println("Please enter a text to be printed:");
        String text = in.nextLine();
        System.out.println("Please enter the number of times to print the text:");
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }

    private static void isLeapYear() {        
        System.out.println("Please enter a year to check if it's a leap year:");
        int year = in.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }

    private static void countLetters() {
        String word = "rindfleischetikettierungsueberwachungsaufgabenuebertragungsgesetz";
        System.out.println("The word is: " + word);
        int[] charCounter = new int[26];
        // initialize the counter array
        for (int i = 0; i < charCounter.length; i++) {
            charCounter[i] = 0;
        }
        // convert the word to char array
        char[] chars = word.toCharArray();
        // count the letters
        for (char c : chars) {
            int index = c - 'a';
            charCounter[index]++;
        }
        // print the result
        for (int i = 0; i < charCounter.length; i++) {
            System.out.print((char) ('a' + i) + ":" + charCounter[i] + " ");
        }
    }

    private static void countVowelsAndConsonants() {
        String word = "rindfleischetikettierungsueberwachungsaufgabenuebertragungsgesetz";
        System.out.println("The word is: " + word);
        int vowels = 0;
        int consonants = 0;
        // convert the word to char array
        char[] chars = word.toCharArray();
        // count the letters
        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        // print the result
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }






    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(int divisor, int num) {
        if (num <= 2)
            return (num == 2) ? true : false;
        if (num % divisor == 0)
            return false;
        if (divisor * divisor > num)
            return true;
        return isPrime(divisor + 1, num);
    }

}
