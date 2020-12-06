package io.asbun;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setSize(800,800);
        frame.setTitle("Snowman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent componenet = new Chart();

        frame.add(componenet);
        frame.setVisible(true);
    }
}
