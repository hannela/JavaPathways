package com.company.buttons;

import com.company.labels.HelpMessageLabel;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DisplayHelpMessageButton extends JButton {
    private DisplayHelpMessageButton(){
        this.setSize(200, 40);
        this.setLocation(250, 200);
        this.setText("Display Help Message");
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> displayHelpMessage());
        this.setVisible(true);
    }
    // This creates an instance of the button.
    private static DisplayHelpMessageButton instance = new DisplayHelpMessageButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static DisplayHelpMessageButton getDisplayHelpMessageButtonInstance() {
        return instance;
    }


    public void displayHelpMessage(){
        this.setVisible(false);
        HelpMessageLabel.getHelpMessageLabelInstance().setVisible(true);

    }
}
