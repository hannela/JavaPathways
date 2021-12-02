package com.company.utilities;

import com.company.Main;
import com.company.MainPanel;
import com.company.buttons.DarkModeButton;
import com.company.buttons.LightModeButton;
import com.company.screens.AddHelpMessageScreen;
import com.company.screens.AddReminderScreen;
import com.company.screens.HomeScreen;

import javax.swing.*;
import java.awt.*;

public class ColorModes {
    private ColorModes() { }

    public static Color darkModeBackground = Color.GRAY;
    public static Color darkModeText = Color.BLACK;
    public static Color lightModeBackground = new Color(235, 200, 255);
    public static Color lightModeText = Color.MAGENTA;

    public static Boolean usingLightMode = true;

    public static void switchBackgroundColor(JPanel panel) {
        if (usingLightMode) {
            panel.setBackground(ColorModes.lightModeBackground);
        } else {
            panel.setBackground(ColorModes.darkModeBackground);
        }
    }

    // I think it's possible to build a method in here where you pass "this"
    // when calling it on a JPanel, and it can find all the components and swap their colors out.
    public static void switchMode() {
        if(usingLightMode){     // switch to dark mode
            usingLightMode = false;
            MainPanel.getMainPanelInstance().setBackground(darkModeBackground);
            for (Component child : HomeScreen.getHomeScreenInstance().getComponents()) {
                child.setForeground(darkModeText);
            }
            for (Component child : AddReminderScreen.getAddReminderScreenInstance().getComponents()) {
                child.setForeground(darkModeText);
            }
            for (Component child : AddHelpMessageScreen.getAddHelpMessageScreenInstance().getComponents()) {
                child.setForeground(darkModeText);
            }
        }
        else{
            usingLightMode = true;
            MainPanel.getMainPanelInstance().setBackground(lightModeBackground);    // I thought all the panels except main were supposed to be clear?
            for (Component child : HomeScreen.getHomeScreenInstance().getComponents()) {
                child.setForeground(lightModeText);
            }
            for (Component child : AddReminderScreen.getAddReminderScreenInstance().getComponents()) {
                child.setForeground(lightModeText);
            }
            for (Component child : AddHelpMessageScreen.getAddHelpMessageScreenInstance().getComponents()) {
                child.setForeground(lightModeText);
            }
        }

        LightModeButton.getLightModeButtonInstance().setVisible(!usingLightMode);
        DarkModeButton.getDarkModeButtonInstance().setVisible(usingLightMode);
    }
}
