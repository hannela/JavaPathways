package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DarkModeButton extends JButton {
    private DarkModeButton(){
        this.setText("Dark Mode");
        this.setSize(190, 30);
        this.setLocation(490, 400);
        this.setForeground(ColorModes.darkModeText);
        this.setVisible(true);
        this.addActionListener((ActionEvent e) -> darkMode());
    }

    private static DarkModeButton instance = new DarkModeButton();

    public static DarkModeButton getDarkModeButtonInstance() {
        return instance;
    }

    public void darkMode(){}
}
