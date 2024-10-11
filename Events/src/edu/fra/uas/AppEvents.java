package edu.fra.uas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import edu.fra.uas.events.ELIExample1;
import edu.fra.uas.events.ELIExample2;
import edu.fra.uas.events.LCExample;
import edu.fra.uas.events.ACExample;

import edu.fra.uas.events.custom.CustomEventSource;
import edu.fra.uas.events.custom.CustomListenerObject;

public class AppEvents {
    public static void main(String[] args) throws Exception {
        eventListenerExampleOne();
        //eventListenerExampleTwo();
        //localClassExample();
        //anonymousClassExample();
        //customListenerExample();
    }

    public static void eventListenerExampleOne() {
        ELIExample1.main(null);
    }

    public static void eventListenerExampleTwo() {
        ELIExample2.main(null);
    }

    public static void localClassExample() {
        LCExample.main(null);
    }

    public static void anonymousClassExample() {
        ACExample.main(null);
    }

    public static void customListenerExample() {
        CustomEventSource ces = new CustomEventSource();
        ces.addListener(new CustomListenerObject());
        // read from console
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                System.out.println("Enter \"event\" to start an event or \"q\" to quit:");
                String command = userInput.readLine();
                if(command.toLowerCase().contentEquals("q")) {
                    break;
                }
                if(command.toLowerCase().contentEquals("event")) {
                    ces.update();
                }
            } catch (IOException e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
        }
    }

}
