package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LightModeButton extends JButton {
    private LightModeButton(){
        this.setText("Light Mode");
        this.setSize(190, 30);
        this.setLocation(490, 400);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(false);
        this.addActionListener((ActionEvent e) -> lightMode((JPanel) this.getParent()));
    }

    private static LightModeButton instance = new LightModeButton();

    public static LightModeButton getLightModeButtonInstance() {
        return instance;
    }

    public void lightMode(JPanel currentPanel){
        ColorModes.switchMode(currentPanel);
    }
}
