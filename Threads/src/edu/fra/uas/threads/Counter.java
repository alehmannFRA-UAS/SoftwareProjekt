package edu.fra.uas.threads;

public class Counter {

    private final int maxCount; // final: can't be changed after initialization
    private int count;

    public Counter(int maxCount) {
        this.maxCount = maxCount;
        this.count = 0;
    }

    public void increment() {
        if (count < maxCount) {
            count++;
        }
    }

    public int value() {
        return count;
    }

    public int maxCount() {
        return maxCount;
    }

}
