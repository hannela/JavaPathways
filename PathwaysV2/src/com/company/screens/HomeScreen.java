package com.company.screens;
import com.company.buttons.*;
import com.company.labels.HelpMessageLabel;
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
    JButton setNewMessageButton = SetNewMessageButton.getSetNewMessageButtonInstance();
    JButton lightModeButton = LightModeButton.getLightModeButtonInstance();
    JButton darkModeButton = DarkModeButton.getDarkModeButtonInstance();
    JButton displayHelpMessageButton = DisplayHelpMessageButton.getDisplayHelpMessageButtonInstance();
    JButton addReminderButton = AddReminderButton.getAddReminderButtonInstance();

    JLabel welcomeInstructionsText;
    JLabel clickHelpButtonInstructionsText; // becomes visible after help message is added and welcome instructions disappear
    JLabel helpMessageLabel = HelpMessageLabel.getHelpMessageLabelInstance();

    private HomeScreen() {
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent

        welcomeInstructionsText = LabelFactory.getLabel(600, 200, 50, 50, "<html><p>Welcome to Pathways!<br/> " +
                "You can customize your 'Help' button message to fit your needs.<br/> " +
                "Click the 'Write New Message' button to customize your HELP message.</p></html>", ColorModes.lightModeText);
        clickHelpButtonInstructionsText = LabelFactory.getLabel(190, 30, 290, 150, "Click 'Help' button!", ColorModes.lightModeText);

        this.add(clickHelpButtonInstructionsText);
        clickHelpButtonInstructionsText.setVisible(false);

        this.add(welcomeInstructionsText);
        this.add(setNewMessageButton);
        this.add(addReminderButton);
        this.add(displayHelpMessageButton);

        this.add(backButton);
        BackButton.setBackButtonAction("TestExit");

        this.add(lightModeButton);
        lightModeButton.setVisible(false);

        this.add(darkModeButton);

        this.add(helpMessageLabel);

        helpMessageLabel.setVisible(false);

    }

}
