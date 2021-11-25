package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class SetNewMessageButton extends JButton {


    // Build the button in the constructor.
    private SetNewMessageButton() {
        this.setText("Write New Message");
        this.setSize(190, 30);
        this.setLocation(490, 400);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> newMessage());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static SetNewMessageButton instance = new SetNewMessageButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static SetNewMessageButton getSetNewMessageButtonInstance() {
        return instance;
    }

    // The method that the button implements
    public void newMessage() {
    }

//    newMessageB = makeButton(490, 400, 190, 30, "Write New Message", lightModeText,
//                (ActionEvent e) -> newMessage());
//    public void newMessage() {
//        welcomeL.setVisible(false);
//        inputTF.setVisible(true);
//        instructions.setVisible(true);
//        //saveButton.setVisible(true);
//        messageB.setVisible(false);
//        messageL.setVisible(false);
//        newMessageB.setVisible(false);
//        clickL.setVisible(false);
//        inputTF.setText("");
//        backB.setVisible(true);
//
//    }
}
