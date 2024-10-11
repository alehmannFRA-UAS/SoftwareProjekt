package edu.fra.uas.events;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.WindowListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

public class ELIExample2 extends Frame implements KeyListener, WindowListener {

    public ELIExample2() {
        super("KeyListener & WindowListener Example");
        setBounds(100, 100, 400, 400);
        setVisible(true);
        addKeyListener(this);   // register the listener
        addWindowListener(this); // register the listener
    }

    public void paint(Graphics g) {
        String msg = "Press ESC or Close-Button to exit";
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

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }
    
    public static void main(String[] args) {
        new ELIExample2();
    }

}
