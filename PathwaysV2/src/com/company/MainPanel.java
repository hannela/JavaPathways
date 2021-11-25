package com.company;

import com.company.utilities.ColorModes;

import javax.swing.*;


public class MainPanel extends JPanel {

    // This creates an instance of the panel.
    private static MainPanel instance = new MainPanel();

    // The method to get an instance (the copy) of the panel.
    // All instances point to the same copy of the panel.
    public static MainPanel getMainPanelInstance() {
        return instance;
    }



    private MainPanel() {
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager

        // We set the background color in the parent panel,
        // and set the other panels transparent. (this.setOpaque(false);)
        // This means we only have to change the background on one panel.
        ColorModes.setBackgroundColor(this);

        // default starting screen
        this.add(HomeScreen.getHomeScreenInstance());


    }
}
