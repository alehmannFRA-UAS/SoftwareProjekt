package edu.fra.uas.events;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LCExample extends Frame {

    public LCExample() {
        super("Local Class Example");
        setBounds(100, 100, 400, 400);
        setVisible(true);
        addKeyListener(new MyKeyListener());
        addWindowListener(new MyWindowListener());
    }

    public void paint(Graphics g) {
        String s = "Press ESC, or Close-Button ";
        s += "to terminate program!";
        g.drawString(s, 50, 100);
    }

    public static void main(String[] args) {
        new LCExample();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                dispose();
                System.exit(0);
            }
        }
    }

    class MyWindowListener extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
        }
    }

}
