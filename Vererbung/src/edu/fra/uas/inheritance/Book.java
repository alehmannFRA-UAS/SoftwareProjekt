package edu.fra.uas.inheritance;

public class Book extends Article {

    public String author;
	public String title;
	
	public Book(int c, int p, String a, String t) {
		super(c, p);
		this.author = a;
		this.title = t;
	}

	@Override
	public void print() {
		super.print();
    	System.out.print(" " + author + ": " + title);
    }

}
