package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class SaveReminderButton extends JButton {

    // Build the button in the constructor.
    private SaveReminderButton() {
        this.setText("Save");
        this.setSize(70, 30);
        this.setLocation(515, 150);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> saveMessage());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static SaveReminderButton instance = new SaveReminderButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static SaveReminderButton getSaveReminderButtonInstance() {
        return instance;
    }

    // The method that the button implements
    public void saveMessage() {
        // helpMessage = inputTF.getText(); < input text field
        // inputTF.setVisible(false);
        // instructions.setVisible(false); < label
        //saveButton.setVisible(false);
//        messageB.setVisible(true);
//        messageB.setEnabled(true);
//        newMessageB.setVisible(true);
//        clickL.setVisible(true);
    }
}
