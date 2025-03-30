package src;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MenuPanel extends JPanel {
    

    public MenuPanel(){
        setBackground(Color.GRAY);
    }


    @Override
    public Dimension getPreferredSize(){
        return new Dimension(400, 50);
    }
}
