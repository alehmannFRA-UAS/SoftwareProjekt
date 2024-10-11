package edu.fra.uas.events;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ACExample extends Frame {

    public void paint(Graphics g) {
        String s = "Press ESC, or Close-Button";
        s += " to terminate program!";
        g.drawString(s, 50, 100);
    }

    public ACExample() {
        super("Anonym Classes");
        setBounds(100, 100, 400, 400);
        setVisible(true);

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    dispose();
                    System.exit(0);
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });

    }

    public static void main(String[] args) {
        new ACExample();
    }

}
