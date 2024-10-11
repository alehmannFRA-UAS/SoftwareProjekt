package edu.fra.uas.modifier.tools.edit;

public class TextArea {

    private char[] text;

    int linecount;

    protected void formatText() {};

    public void setText(char[] text) {
        this.text = text;
    }

    public char[] getText() {
        return text;
    }
    
}
