package edu.fra.uas;

import java.util.Scanner;
import java.util.InputMismatchException;

import edu.fra.uas.exceptions.Exception1;
import edu.fra.uas.exceptions.Exception2;
import edu.fra.uas.exceptions.Exception3;

public class AppExceptions {
    public static void main(String[] args) throws Exception {
        exceptionTest();
        //catchException();
        //exceptionsTest();
        //fileNameTester();
    }

    public static void exceptionTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number;
        try{
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        //} catch (Exception e) { // catch all exceptions
        //    System.out.println("You did not enter a number.");
        } catch (InputMismatchException e) {
            System.out.println("You did not enter a number.");
        } finally {
            System.out.println("This is the finally block.");
            scanner.close();
        }
    }

    public static void catchException() {
        try {
            throw new Exception("This is an exception");
            //throw new Exception("This is an exception", new Exception("This is the cause of the exception"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //System.out.println(e.getCause().getMessage());
        }
    }

    public static void exceptionsTest() {
        int[] numbers = {-1, 0, 1};
        for (int number : numbers){
            System.out.println("Number is: " + number);
            exceptions(number);
            System.out.println();
        }
    }

    public static void exceptions(int number) {
        try {
            p(number);
            q(number);
            r(number);
        } catch (Exception1 e) {
            System.out.println(e.getMessage());
        } catch (Exception2 e) {
            System.out.println(e.getMessage());
        } catch (Exception3 e) {
            System.out.println(e.getMessage());
        }
    }

    public static void p(int number) throws Exception1 {
        if(number == 0) {
            throw new Exception1("Number is zero");
        }
        System.out.println("p() terminated normally");
    }

    public static void q(int number) throws Exception2 {
        if(number < 0) {
            throw new Exception2("Number is negative");
        }
        System.out.println("q() terminated normally");
    }

    public static void r(int number) throws Exception3 {
        if(number > 0) {
            throw new Exception3("Number is positive");
        }
        System.out.println("r() terminated normally");
    }

    public static void fileNameTester() {
        String[] fileNames = {"file.txt", "file.ttt"};
        //for (String fileName : fileNames) {
        //    fileNameChecker(fileName);
        //}
        for (String fileName : fileNames) {
            fileNameCheckerUnchecked(fileName);
        }
    }

    public static void fileNameChecker(String fileName) throws Exception {
        if (!fileName.endsWith(".txt")) {
            throw new Exception("File name does not end with .txt");
        }
    }

    public static void fileNameCheckerUnchecked(String fileName) throws RuntimeException {
        if (!fileName.endsWith(".txt")) {
            throw new RuntimeException("File name does not end with .txt");
        }
    }

}
