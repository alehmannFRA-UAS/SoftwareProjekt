package edu.fra.uas.inheritance;

public class Camera extends Article {

    public String resolution;
    
    public Camera(int code, int price, String resolution) {
        super(code, price);
        this.resolution = resolution;
    }
    
    @Override   
    public void print() {
        super.print();
    	System.out.print(" " + resolution);
    }

}
