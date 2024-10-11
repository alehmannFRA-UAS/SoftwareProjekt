package edu.fra.uas.inheritance;

public class Audio extends Article {

    public int songs;
    
    public Audio(int code, int price, int songs) {
        super(code, price);
        this.songs = songs;
    }

    @Override
    public void print() {
        super.print();
    	System.out.print(" has " + songs + " songs");
    }

}
