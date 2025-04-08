package src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
    private PseudoPanel paintPanel;    

    public MenuPanel(PseudoPanel paintPanel){
        this.paintPanel = paintPanel;
        
        setBackground(Color.GRAY);
        add(new ColorButton(Color.WHITE));
        add(new ColorButton(Color.BLACK));
        add(new ColorButton(Color.GREEN));
    }



    //TODO AcitonPerformed
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(400, 50);
    }




    private class ColorButton extends JButton implements ActionListener { //? If want to check for hovering, will want mouselistener
        private Color color;
        
        public ColorButton(Color color){
            this.color = color;
            setBackground(color);
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            this.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e){
            setColor(this.color);
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

        public void setColor(Color color){
            paintPanel.setBrushColor(color);
        }
    }
}
