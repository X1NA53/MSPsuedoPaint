package src;


import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.Point;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.BasicStroke;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

public class PseudoPanel extends JPanel {
    private BufferedImage img;
    private Graphics2D graphics;

    private ArrayList<Point> points = new ArrayList<>();
    
    public PseudoPanel(){
        setBackground(Color.BLACK);


        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e){
                points.add(new Point(e.getX(), e.getY()));
                useBrush();
            }

            @Override
            public void mouseReleased(MouseEvent e){
                points.clear();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e){
                points.add(new Point(e.getX(), e.getY()));
                useBrush();
            }
        });
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(400, 400);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        if(img == null){
            img = new BufferedImage((int) getSize().getWidth(), (int) getSize().getHeight(), BufferedImage.TYPE_INT_ARGB);
            graphics = img.createGraphics();

            graphics.setColor(Color.GRAY);
            graphics.setStroke(new BasicStroke(15, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        }
        
        g.drawImage(img, 0, 0, null);
    }

    public void useBrush(){
        Point p = points.getFirst();
        graphics.fillOval((int) (p.x - 7.5), (int) (p.y - 7.5), 15, 15);

        for (int i = 0; i < points.size() - 1; i++) {
            graphics.drawLine(points.get(i).x, points.get(i).y, points.get(i +1).x, points.get(i + 1).y);
        }
        repaint();
    }
}
