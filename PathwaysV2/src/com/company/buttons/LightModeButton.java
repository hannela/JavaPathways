package com.company.buttons;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LightModeButton extends JButton {
    private LightModeButton(){
        this.setText("Light Mode");
        this.setSize(190, 30);
        this.setLocation(490, 350);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
        this.addActionListener((ActionEvent e) -> lightMode());
    }

    private static LightModeButton instance = new LightModeButton();

    public static LightModeButton getLightModeButtonInstance() {
        return instance;
    }

    public void lightMode(){}
}
