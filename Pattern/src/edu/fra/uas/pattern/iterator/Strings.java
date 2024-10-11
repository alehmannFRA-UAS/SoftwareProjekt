package edu.fra.uas.pattern.iterator;

public class Strings {

    private String[] data;

    public Strings(String[] data) {
        this.data = data;
    }

    public StringIterator iterator() {
        // anonymous inner class
        return new StringIterator() {

            int index = 0;

            public boolean hasNext() {
                return index < data.length;
            }

            public String next() {
                return data[index++];
            }

        };

    }
}
