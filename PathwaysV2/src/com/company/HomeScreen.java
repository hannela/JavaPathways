package com.company;
import com.company.buttons.BackButton;
import com.company.buttons.SaveReminderButton;
import com.company.utilities.ScreenUtilities;

import javax.swing.*;

import static com.company.MainFrame.mainPanel;

public class HomeScreen extends JPanel {

    // This creates an instance of the button.
    private static HomeScreen instance = new HomeScreen();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static HomeScreen getHomeScreenInstance() {
        return instance;
    }

    JButton saveReminderButton = SaveReminderButton.getSaveReminderButtonInstance();
    JButton backButton = BackButton.getBackButtonInstance();

    private HomeScreen() {
        ScreenUtilities.setAllInvisible(mainPanel);
        mainPanel.add(this);
        this.add(saveReminderButton);
        saveReminderButton.setVisible(true);

        this.add(backButton);
        BackButton.setBackButtonAction("TestExit");

    }

    public JLabel instructionsLabel;

    public JButton helpMessageButton;
    public JButton createNewReminderButton;
    public JButton writeNewMessageButton;
    public JButton darkModeButton;

    public JButton messageB = Screen.messageB;




}
