package com.company.screens;

import com.company.buttons.*;
import com.company.textfields.AddReminderTextField;
import com.company.utilities.ColorModes;
import com.company.utilities.LabelFactory;

import javax.swing.*;

public class AddReminderScreen extends JPanel {
    // This creates an instance of the panel.
    private static AddReminderScreen instance = new AddReminderScreen();

    // The method to get an instance (the copy) of the panel.
    // All instances point to the same copy of the panel.
    public static AddReminderScreen getAddReminderScreenInstance() {
        return instance;
    }

    JLabel addReminderInstructionsText;
    JTextField addReminderTextField = AddReminderTextField.getAddReminderTextFieldInstance();
    JButton saveReminderButton = SaveReminderButton.getSaveReminderButtonInstance();
    JButton backButton = BackButtonNewReminderToHomeScreen.getBackButtonNewReminderToHomeScreenInstance();
    JButton darkModeButton = DarkModeButton.getDarkModeButtonInstance();
    JButton lightModeButton = LightModeButton.getLightModeButtonInstance();

    // private constructor
    private AddReminderScreen(){
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent

        addReminderInstructionsText = LabelFactory.getLabel(300, 40, 275, 115, "Add new reminder here:", ColorModes.lightModeText);
        this.add(addReminderInstructionsText);

        this.add(backButton);
        this.add(addReminderTextField);
        this.add(saveReminderButton);
//        this.add(lightModeButton);
//        this.add(darkModeButton);
    }
}
