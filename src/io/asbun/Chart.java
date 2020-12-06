package io.asbun;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Chart extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g.setColor(Color.decode("#d789d7"));
        g.fillRect(0, 0, 800, 400);
        g.setColor(Color.decode("#9d65c9"));
        g.fillRect(0, 400, 800, 200);
        g.setColor(Color.decode("#2a3d66"));
        g.fillRect(0, 600, 800, 200);

        // Snow-Dad
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(175,300,120, 120);
        g.fillOval(155,400,150,150);
        g.fillOval(130,518, 200,200);
        g.setColor(Color.decode("#0a043c"));
        g.fillRect(192,240, 90,65);
        g.fillRect(170,305,135,12);
            //Arms
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
            //Right
        g2.draw(new Line2D.Float(160,450,130,465));
        g2.draw(new Line2D.Float(130,465,120,550));
            //Left
        g2.draw(new Line2D.Float(300,450,330,465));
        g2.draw(new Line2D.Float(330,465,340,550));


        //Snow-mom
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(395,340,100, 100);
        g.fillOval(375,425,130,130);
        g.fillOval(350,530, 180,180);
            //Arms
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
            //Right
        g2.draw(new Line2D.Float(386,455,355,465));
        g2.draw(new Line2D.Float(355,465,340,550));
            //Left
        g2.draw(new Line2D.Float(495,455,528,465));
        g2.draw(new Line2D.Float(528,465,540,550));

        //Snow-daughter
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(578,515,45, 45);
        g.fillOval(565,550,70,70);
        g.fillOval(550,600, 100,100);


    }
}
