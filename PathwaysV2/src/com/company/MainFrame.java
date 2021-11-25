package com.company;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame {

    // The parent panel. All other panels and components are swapped in and out of this one.
    public JPanel mainPanel = MainPanel.getMainPanelInstance();

    public MainFrame() {
        this.setTitle("Java Pathways: Help Message");
        this.setSize(700, 550);
        this.setLocation(100, 100);


        mainPanel.setSize(700, 550);
        this.add(mainPanel);

        // don't need this line bc it's part of the mainPanel constructor
        //mainPanel.add(HomeScreen.getHomeScreenInstance());



        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }//windowClosing
        });
    }
}
