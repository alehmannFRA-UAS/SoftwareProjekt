package edu.fra.uas.inner.method;

public class Outside {

    private String name;
	private int number;
	
	public Outside(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void print() {
        
        int v = 23;

		// Inner class
		class Inside{
			public void print() {
				System.out.println("Inside.print() called");
                System.err.println(name + " " + number);
                //System.err.println(v);
                //v = 42; // Does not work
			}
		}
		
		Inside inside = new Inside();
		inside.print();
	}

}
