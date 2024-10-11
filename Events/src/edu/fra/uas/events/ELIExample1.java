package edu.fra.uas.events;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class ELIExample1 extends Frame implements KeyListener {

    public ELIExample1() {
        super("KeyListener Example");
        setBounds(100, 100, 400, 400);
        setVisible(true);
        addKeyListener(this);   // register the listener
    }

    public void paint(Graphics g) {
        String msg = "Press ESC to exit";
        g.drawString(msg, 100, 100);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            dispose();
            System.exit(0);
        }
        if (e.getKeyCode() == KeyEvent.VK_R) {  // toggle resizable
            setResizable(!isResizable());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + e.getKeyChar());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new ELIExample1();
    }

}
