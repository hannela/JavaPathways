package com.company;
import javax.swing.*;
import java.awt.*;

public class Screen extends JFrame {

    public Screen() {
        JPanel mainPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1060, 740));
        this.add(mainPanel);
        mainPanel.add(FirstMessage());
        //this.pack();
        this.setLocationRelativeTo(null);
        //initComponents();
    }

    public JLabel FirstMessage() {

        JLabel helpMessage = new JLabel("I am having a migraine, please get me a coke");
        return helpMessage;
    }


}