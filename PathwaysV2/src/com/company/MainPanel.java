package com.company;

import com.company.buttons.DarkModeButton;
import com.company.buttons.LightModeButton;
import com.company.screens.AddHelpMessageScreen;
import com.company.screens.AddReminderScreen;
import com.company.screens.HomeScreen;
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


    JButton darkModeButton = DarkModeButton.getDarkModeButtonInstance();
    JButton lightModeButton = LightModeButton.getLightModeButtonInstance();

    private MainPanel() {
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager

        this.add(darkModeButton);
        this.add(lightModeButton);
        lightModeButton.setVisible(false);
        // We set the background color in the parent panel,
        // and set the other panels transparent. (this.setOpaque(false);)
        // This means we only have to change the background on one panel.
        ColorModes.switchBackgroundColor(this);

        // default starting screen
        this.add(HomeScreen.getHomeScreenInstance());

        //tests
        //this.add(AddHelpMessageScreen.getAddHelpMessageScreenInstance());
        //this.add(AddReminderScreen.getAddReminderScreenInstance());

    }
}
