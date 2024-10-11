package edu.fra.uas.modifier.tools;

import edu.fra.uas.modifier.tools.edit.TextArea;

public class Doc {

    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.setText(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println(textArea.getText());
        //textArea.formatText();   // formatText is not visible
        //textArea.linecount = 5;   // linecount is not visible
    }

}
