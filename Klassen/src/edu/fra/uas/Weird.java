package edu.fra.uas;

import edu.fra.uas.classes.Fraction;

public class Weird {

    public void doSideEffects(Fraction f1, Fraction f2) {
        Fraction temp = f1;
        f1 = f2;
        f2 = temp;        
    }
    
}
