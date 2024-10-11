package edu.fra.uas.inheritance;

public class CD extends Audio {

    public String interpret;

    public CD(int code, int price, int songs, String interpret) {
        super(code, price, songs);
        this.interpret = interpret;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" by " + interpret + " interpreted");
    }

}
