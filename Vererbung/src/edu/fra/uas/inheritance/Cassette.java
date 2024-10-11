package edu.fra.uas.inheritance;

public class Cassette extends Audio {

    public double length;

    public Cassette(int code, int price, int songs, double length) {
        super(code, price, songs);
        this.length = length;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" " + length + " minutes");
    }

}
