package edu.fra.uas.modifier.tools.edit;

public class TextEditor {

    public static void main(String[] args) {
        TextArea textArea = new TextArea();
        textArea.setText(new char[] {'H', 'e', 'l', 'l', 'o'});
        System.out.println(textArea.getText());
        textArea.formatText();
        textArea.linecount = 5;
    }
}
