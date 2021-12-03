package com.company.screens;
import com.company.buttons.*;
import com.company.labels.HelpMessageLabel;
import com.company.labels.WelcomeMessageLabel;
import com.company.utilities.ColorModes;
import com.company.utilities.LabelFactory;

import javax.swing.*;

public class HomeScreen extends JPanel {

    // This creates an instance of the panel.
    private static HomeScreen instance = new HomeScreen();

    // The method to get an instance (the copy) of the panel.
    // All instances point to the same copy of the panel.
    public static HomeScreen getHomeScreenInstance() {
        return instance;
    }

    JButton backButton = BackButton.getBackButtonInstance();
    JButton setNewMessageButton = WriteNewMessageButton.getSetNewMessageButtonInstance();
    JButton lightModeButton = LightModeButton.getLightModeButtonInstance();
    JButton darkModeButton = DarkModeButton.getDarkModeButtonInstance();
    JButton displayHelpMessageButton = DisplayHelpMessageButton.getDisplayHelpMessageButtonInstance();
    JButton addReminderButton = AddReminderButton.getAddReminderButtonInstance();
    JButton showRemindersButton = ShowRemindersButton.getShowRemindersButtonInstance();

    JLabel welcomeInstructionsText = WelcomeMessageLabel.getWelcomeMessageLabelInstance();
    JLabel clickHelpButtonInstructionsText; // becomes visible after help message is added and welcome instructions disappear
    JLabel helpMessageLabel = HelpMessageLabel.getHelpMessageLabelInstance();

    private HomeScreen() {
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent

        this.add(welcomeInstructionsText);
        clickHelpButtonInstructionsText = LabelFactory.getLabel(190, 30, 290, 150, "Click 'Help' button!", ColorModes.lightModeText);

        this.add(clickHelpButtonInstructionsText);
        clickHelpButtonInstructionsText.setVisible(false);

        this.add(welcomeInstructionsText);
        this.add(setNewMessageButton);
        this.add(addReminderButton);
        this.add(displayHelpMessageButton);
        this.add(showRemindersButton);

        this.add(backButton);
        BackButton.setBackButtonAction("TestExit");

//        this.add(lightModeButton);
//        lightModeButton.setVisible(false);
//
//        this.add(darkModeButton);
//        darkModeButton.setVisible(true);

        this.add(helpMessageLabel);

        helpMessageLabel.setVisible(false);

    }

}
