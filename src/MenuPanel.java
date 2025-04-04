package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class MenuPanel extends JPanel {
    Color brushColor;
    

    public MenuPanel(){ //TODO fix arguments
        setBackground(Color.GRAY);
        add(new ColorButton(Color.WHITE));
        add(new ColorButton(Color.BLACK));
        add(new ColorButton(Color.GREEN));

        // addMouseListener(new MouseAdapter() {
        //     @Override
        //     public void mouseClicked(MouseEvent e){
        //         ColorButton colorButton = (ColorButton) e.getSource();
        //         PseudoPanel.setBrushColor(colorButton.getColor());
        //     }
        // });
    }



    //TODO AcitonPerformed
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(400, 50);
    }
}
