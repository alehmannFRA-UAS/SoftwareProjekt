package edu.fra.uas;

import java.io.FilterOutputStream;
import java.io.OutputStream;

public class EncoderOutputStream extends FilterOutputStream {

    private int odd = Integer.MAX_VALUE;

    public EncoderOutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws java.io.IOException {
        if (odd == Integer.MAX_VALUE) {
            odd = b;
        } else {
            out.write(b);
            out.write(odd);
            odd = Integer.MAX_VALUE;
        }
    }

}
