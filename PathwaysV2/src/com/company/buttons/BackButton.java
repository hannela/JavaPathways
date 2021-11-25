package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class BackButton extends JButton {

    // Build the button in the constructor.
    private BackButton() {
        this.setText("Back");
        this.setSize(190, 30);
        this.setLocation(490, 450);
        this.setForeground(ColorModes.lightModeText);
        // this.addActionListener((ActionEvent e) -> back());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static final BackButton instance = new BackButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static BackButton getBackButtonInstance() {
        return instance;
    }

    public static void setBackButtonAction(String whichPageTheBackButtonIsOn) {
        switch(whichPageTheBackButtonIsOn) {
            case "HomeScreen":  instance.setVisible(false);
            break;
//            case "TestChangeColor":
//            break;
            case "TestExit": setForComplicatedScreen();
            break;
            default: // do nothing
                break;
        }
    }

    // For simple, one line commands.
//    ActionListener setdarkmode = (ActionEvent e) -> ColorModes.switchColorsDark(getParent());

    // For more complicated (multi-line) commands.
    // This example displays the button, then adds the action listener.
    // The action listener is built below.
    public static void setForComplicatedScreen() {
        instance.setVisible(true);
        instance.addActionListener(complicatedAction);
    }

    static ActionListener complicatedAction = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    };
}
