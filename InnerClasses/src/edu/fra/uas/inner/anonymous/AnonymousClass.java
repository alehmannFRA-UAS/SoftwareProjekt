package edu.fra.uas.inner.anonymous;

public class AnonymousClass {

    public static void printTable(Function func) {
		System.out.println("Table " + func);
		for(double x=0.0; x <= 5.0; x += 0.5) {
			System.out.println(x + "->" + func.compute(x));
		}
	}
    
}
