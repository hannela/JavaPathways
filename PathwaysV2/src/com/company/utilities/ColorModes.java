package com.company.utilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorModes {
    private ColorModes() { }

    public static Color darkModeBackground = Color.DARK_GRAY;
    public static Color darkModeText = Color.BLACK;
    public static Color lightModeBackground = new Color(235, 200, 255);
    public static Color lightModeText = Color.MAGENTA;

    public static Boolean usingLightMode = true;

    public static void setBackgroundColor(JPanel panel) {
        if (usingLightMode) {
            panel.setBackground(ColorModes.lightModeBackground);
        } else {
            panel.setBackground(ColorModes.darkModeBackground);
        }
    }

    // I think it's possible to build a method in here where you pass "this"
    // when calling it on a JPanel, and it can find all the components and swap their colors out.
    public static void switchColorsDark(JPanel currentPanel) {
//        lightModeButton.setVisible(true);
//        darkModeButton.setVisible(false);

        currentPanel.setBackground(darkModeBackground);

        for (Component child : currentPanel.getComponents()) {
            child.setForeground(darkModeText);
        }

//        if (lightModeFlag){
//            lightModeButton.setVisible(true);
//        }
//        else{
//            darkModeButton.setVisible(true);
//        }
    }
}
