package edu.fra.uas.inheritance;

public class Article {

    public int code;
    public int price;
    
    public Article(int code, int price) {
    	this.code = code;
        this.price = price;
    }
    
    public boolean available() {
    	return true;
    }
    
    public void print() {
    	System.out.print("code: " + code + " price: " + price);
    }
    
}
