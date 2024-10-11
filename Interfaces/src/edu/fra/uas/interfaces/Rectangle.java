package edu.fra.uas.interfaces;

public class Rectangle implements Comparable {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }

    @Override
    public int isLaterThan(Comparable other) {
        Rectangle otherRectangle = (Rectangle) other;
        if (this.getArea() > otherRectangle.getArea()) {
            return 1;
        } else if (this.getArea() < otherRectangle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

}
