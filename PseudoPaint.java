


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PseudoPaint {


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI(){
        JFrame frame = new JFrame();
        frame.setBackground(Color.GRAY);
        frame.add(new PseudoPanel());
        frame.pack();
        frame.setVisible(true);
    }
}