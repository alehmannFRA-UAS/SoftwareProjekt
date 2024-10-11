package edu.fra.uas.modifier.tools;

import edu.fra.uas.modifier.tools.edit.TextArea;

public class MyText extends TextArea {

    public static void main(String[] args) {
        MyText myText = new MyText();
        myText.setText(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println(myText.getText());
        myText.formatText();
        //myText.linecount = 5;   // linecount is not visible
    }


}
