package io.asbun;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class Chart extends JComponent{
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        // Background
        g.setColor(Color.decode("#d789d7"));
        g.fillRect(0, 0, 800, 405);
        g.setColor(Color.decode("#9d65c9"));
        g.fillRect(0, 405, 800, 200);
        g.setColor(Color.decode("#2a3d66"));
        g.fillRect(0, 600, 800, 200);

        // Snow Effect
        g.setColor(Color.WHITE);
        for(int j = 0; j <= 400; j+=100){
            for(int i = 0; i < 800; i+=100){
                g.fillOval(i+100,j,5,5);
            }
            for(int i = 0; i < 800; i+=100){
                g.fillOval(i+50,j-50,5,5);
            }
        }

        //Clouds
        g.setColor(Color.decode("#e8e8e8"));
        g.fillOval(0,50,200, 15);
        g.fillOval(650,25,200, 15);
        g.fillOval(200,75,200, 15);
        g.fillOval(450,80,200, 15);

        //Tree
        g.setColor(Color.decode("#825959"));
        g.fillRect(690,459,20,50);
        g.setColor(Color.decode("#335d2d"));
        g2.fillPolygon(new int[] {650,700,750}, new int[]{460,250,460}, 3);

        // Snow-Dad
            //Body
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(175,300,120, 120);
        g.fillOval(155,400,150,150);
        g.fillOval(130,518, 200,200);
            //Face
        g.setColor(Color.BLACK);
        g.fillOval(200,325,20,20);
        g.fillOval(250,325,20,20);
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Line2D.Float(235, 340, 235, 360));
        g2.draw(new Line2D.Float(215,380,250,380));
        g2.draw(new Line2D.Float(215,380,210,375));
        g2.draw(new Line2D.Float(250,380,255,375));
            //Hat
        g.setColor(Color.decode("#0a043c"));
        g.fillRect(192,240, 90,65);
        g.fillRect(170,305,135,12);
            //Scarf
        g.setColor(Color.decode("#aa3a3a"));
        g2.setStroke(new BasicStroke(25));
        g2.draw(new Line2D.Float(200,410,265,410));
        g2.draw(new Line2D.Float(260,415,275,430));
            // Buttons
        g.setColor(Color.BLACK);
        g.fillOval(220,500,20,20);
        g.fillOval(220,450,20,20);
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(225,505,13,13);
        g.fillOval(225,455,13,13);
            //Arms
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
            //Right
        g2.draw(new Line2D.Float(160,450,130,465));
        g2.draw(new Line2D.Float(130,465,120,540));
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(110,525,20,30);
            //Left
        g.setColor(Color.BLACK);
        g2.draw(new Line2D.Float(300,450,330,465));
        g2.draw(new Line2D.Float(330,465,340,540));


        //Snow-mom
            //Body
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(395,340,100, 100);
        g.fillOval(375,425,130,130);
        g.fillOval(350,530, 180,180);
            //Face
        g.setColor(Color.BLACK);
        g.fillOval(418,365,20,20);
        g.fillOval(456,365,20,20);
        g2.setStroke(new BasicStroke(5));
        g2.draw(new Line2D.Float(447,375,447,390));
        g2.draw(new Line2D.Float(435,408,457,408));
        g2.draw(new Line2D.Float(435,408,430,403));
        g2.draw(new Line2D.Float(457,408,462,403));
            //Ear Muffs
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(385,375,15,30);
        g.fillOval(490,375,15,30);
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Line2D.Float(392,377,405,335));
        g2.draw(new Line2D.Float(405,335,484,335));
        g2.draw(new Line2D.Float(497,377,484,335));
            //Scarf
        g.setColor(Color.decode("#aa3a3a"));
        g2.setStroke(new BasicStroke(25));
        g2.draw(new Line2D.Float(415,433,470,433));
        g2.draw(new Line2D.Float(470,440,480,450));
            // Buttons
        g.setColor(Color.BLACK);
        g.fillOval(430,510,20,20);
        g.fillOval(430,465,20,20);
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(434,514,13,13);
        g.fillOval(434,469,13,13);
            //Arms
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
            //Right
        g2.draw(new Line2D.Float(386,455,355,465));
        g2.draw(new Line2D.Float(355,465,340,540));
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(330,525,20,30);
            //Left
        g.setColor(Color.BLACK);
        g2.draw(new Line2D.Float(495,455,528,465));
        g2.draw(new Line2D.Float(528,465,540,540));


        //Snow-daughter
        g.setColor(Color.decode("#f6f6f6"));
        g.fillOval(578,515,45, 45);
        g.fillOval(565,550,70,70);
        g.fillOval(550,600, 100,100);
            //Face
        g.setColor(Color.BLACK);
        g.fillOval(590,525,8,8);
        g.fillOval(605,525,8,8);
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Line2D.Float(601,530,601,535));
        g2.draw(new Line2D.Float(596,542,606,542));
        g2.draw(new Line2D.Float(596,542,594,540));
        g2.draw(new Line2D.Float(606,542,608,540));
            //Ear Muffs
        g.setColor(Color.decode("#ffc7c7"));
        g.fillOval(575,523,8,15);
        g.fillOval(618,523,8,15);
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
        g2.draw(new Line2D.Float(577,522,580,511));
        g2.draw(new Line2D.Float(580,511,617,511));
        g2.draw(new Line2D.Float(620,522,617,511));
            //Scarf
        g.setColor(Color.decode("#ffc7c7"));
        g2.setStroke(new BasicStroke(10));
        g2.draw(new Line2D.Float(585,553,615,553));
        g2.draw(new Line2D.Float(615,556,625,560));
        // Buttons
        g.setColor(Color.BLACK);
        g.fillOval(595,595,10,10);
        g.fillOval(595,570,10,10);
        g.setColor(Color.decode("#ffc7c7"));
        g.fillOval(597,596,6,6);
        g.fillOval(597,571,6,6);
            //Arms
        g.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(3));
            //Right
        g2.draw(new Line2D.Float(570,570,540,540));
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(530,525,20,30);
            //Left
        g.setColor(Color.BLACK);
        g2.draw(new Line2D.Float(630,570,655,600));
        g.setColor(Color.decode("#aa3a3a"));
        g.fillOval(646,590,10,20);



    }
}
