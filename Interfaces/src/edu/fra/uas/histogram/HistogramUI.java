package edu.fra.uas.histogram;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;


public class HistogramUI extends JPanel {

    private static final long serialVersionUID = 1L;
    static int[] rectHeights = new int[10];

    public static void drawRects(Graphics2D g2d) {
        int left = 0;
        for(int i = 0; i < 10; i++) {
            // alternating colors
            if(i%2 == 0) {
                 g2d.setColor(Color.RED);	
            } else {
                 g2d.setColor(Color.GREEN);	
            }
            // draw rectangle
            g2d.fillRect(10 + left, 200 - (10 * rectHeights[i]) , 30, 10 * rectHeights[i]);
            // draw number below rectangle
            g2d.setColor(Color.BLACK);
            g2d.drawString(Integer.toString(i + 1), left + 20, 220);
            // draw number of counts above rectangle
            g2d.drawString(Integer.toString(rectHeights[i]), left + 20, 220 - (10 * rectHeights[i]));
            // move to next rectangle
            left += 45;
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);				// initiates superclass
        Graphics2D g2d = (Graphics2D) g;		// typecast to 2d graphics
        drawRects(g2d);
    }

    public static Map<Integer, Integer> makeHistogram(Collection collection) {
        Map result = new HashMap();
        Iterator i = collection.iterator();
        while (i.hasNext()) {
            Object x = i.next();
            Integer count = (Integer) result.get(x);
            if (count == null) {
                result.put(x, Integer.valueOf(1));
            } else {
                result.put(x, Integer.valueOf(count.intValue() + 1));
            }
        }
        return result;
    }

    public static void run() {
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 100; i++) {
            int n = rand.nextInt(10) + 1;
            System.out.println(n);
            list.add(n);
        }
        Map<Integer, Integer> m = makeHistogram(list);
        for(int i = 1; i < 11; i++) {
            Integer x = m.get(i);
            if(x == null) {
                rectHeights[i - 1] = 0;
            } else {
                rectHeights[i - 1] = x;
            }
        }
        

        HistogramUI rects = new HistogramUI();		          // this jPanel instance
        JFrame frame = new JFrame("Histogram");         // label for window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close when press x
        frame.add(rects);						              // appends component to frame
        frame.setSize(470, 300);				  // size of window
        frame.setLocationRelativeTo(null); 		          // place to center of screen
        frame.setVisible(true);					          // shows window
    }

}
