package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class DarkModeButton extends JButton {
    private DarkModeButton(){
        this.setText("light mode");
        this.setSize(190, 30);
        this.setLocation(490, 350);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
        this.addActionListener((ActionEvent e) -> darkMode());
    }

    private static DarkModeButton instance = new DarkModeButton();

    public static DarkModeButton getDarkModeButtonInstance() {
        return instance;
    }

    public void darkMode(){}
}
