package edu.fra.uas.interfaces;

public interface Comparable {

    /**
    * compares instances of same class
    * compares this with other instance
    * @param other the other instance to compare
    * @return 1, 0, -1 if this is greater than,
    *         equal to, or less than other
    */
    public int isLaterThan(Comparable other);

}
