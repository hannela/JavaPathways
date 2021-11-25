package com.company;
import com.company.buttons.BackButton;
import com.company.buttons.SaveReminderButton;
import com.company.buttons.SetNewMessageButton;
import com.company.utilities.ColorModes;
import com.company.utilities.ScreenUtilities;

import javax.swing.*;

public class HomeScreen extends JPanel {

    // This creates an instance of the panel.
    private static HomeScreen instance = new HomeScreen();

    // The method to get an instance (the copy) of the panel.
    // All instances point to the same copy of the panel.
    public static HomeScreen getHomeScreenInstance() {
        return instance;
    }

    JButton saveReminderButton = SaveReminderButton.getSaveReminderButtonInstance();
    JButton backButton = BackButton.getBackButtonInstance();
    JButton setNewMessageButton = SetNewMessageButton.getSetNewMessageButtonInstance();

    private HomeScreen() {
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent



        this.add(saveReminderButton);
        this.add(setNewMessageButton);

        this.add(backButton);
        BackButton.setBackButtonAction("TestExit");
    }

    public JLabel instructionsLabel;

    public JButton helpMessageButton;
    public JButton createNewReminderButton;
    public JButton writeNewMessageButton;
    public JButton darkModeButton;





}
