package src;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
        JPanel drawingPanel = new PseudoPanel();
        frame.add(drawingPanel);
        frame.add(new MenuPanel(drawingPanel), BorderLayout.NORTH);
        frame.pack();
        frame.setVisible(true);
    }
}