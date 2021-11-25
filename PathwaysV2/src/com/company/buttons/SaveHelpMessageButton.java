package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SaveHelpMessageButton extends JButton {
    // Build the button in the constructor.
    private SaveHelpMessageButton() {
        this.setText("Save");
        this.setSize(70, 30);
        this.setLocation(515, 150);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> saveHelpMessage());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static SaveHelpMessageButton instance = new SaveHelpMessageButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static SaveHelpMessageButton getSaveHelpMessageButtonInstance() {
        return instance;
    }

    // The method that the button implements
    public void saveHelpMessage() {

    }
}
