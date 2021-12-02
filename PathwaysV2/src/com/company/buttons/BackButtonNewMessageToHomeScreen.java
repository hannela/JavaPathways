package com.company.buttons;

import com.company.MainPanel;
import com.company.screens.AddHelpMessageScreen;
import com.company.screens.HomeScreen;
import com.company.utilities.ColorModes;
import com.company.utilities.ScreenUtilities;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class BackButtonNewMessageToHomeScreen extends JButton {

    // Build the button in the constructor.
    private BackButtonNewMessageToHomeScreen() {
        this.setText("<- Back");
        this.setSize(190, 30);
        this.setLocation(490, 450);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> returnToHome());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static final BackButtonNewMessageToHomeScreen instance = new BackButtonNewMessageToHomeScreen();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static BackButtonNewMessageToHomeScreen getBackButtonNewMessageToHomeScreenInstance() {
        return instance;
    }


    public static ActionListener returnToHomeScreen;

    private void returnToHome(){
        JPanel mainPanelInstance = MainPanel.getMainPanelInstance();
        mainPanelInstance.remove(AddHelpMessageScreen.getAddHelpMessageScreenInstance());

        mainPanelInstance.add(HomeScreen.getHomeScreenInstance());
        mainPanelInstance.revalidate();
        mainPanelInstance.repaint();
    }

    static{
        returnToHomeScreen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel mainPanelInstance = MainPanel.getMainPanelInstance();
                ScreenUtilities.setAllInvisible(mainPanelInstance);

                mainPanelInstance.add(HomeScreen.getHomeScreenInstance());
            }
        };
    }

       // return complicatedAction;
    //}

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
