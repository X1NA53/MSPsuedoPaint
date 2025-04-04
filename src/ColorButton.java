package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;


public class ColorButton extends JComponent {
    private Color color;
    
    public ColorButton(Color color){
        this.color = color;
        setBackground(color);

        addMouseListener(new MouseAdapter() {//TODO DELETE IMPLEMENT ACTIONLISTENER
            @Override
            public void mouseClicked(MouseEvent e){
                ColorButton colorButton = (ColorButton) e.getSource();
                // PseudoPanel.setBrushColor(colorButton.getColor());
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        g.setColor(color);
        g.fillRect(0, 0, getWidth(), getHeight());
    }


    @Override
    public Dimension getPreferredSize(){
        return new Dimension(15, 15);
    }

    public Color getColor(){
        return color;
    }
}
