package com.company.buttons;

import com.company.MainPanel;
import com.company.screens.AddHelpMessageScreen;
import com.company.screens.HomeScreen;
import com.company.utilities.ColorModes;
import com.company.utilities.ScreenUtilities;

import javax.swing.*;
import java.awt.event.ActionEvent;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class WriteNewMessageButton extends JButton {

    // Build the button in the constructor.
    private WriteNewMessageButton() {
        this.setText("Write New Message");
        this.setSize(190, 30);
        this.setLocation(490, 350);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> newMessage());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static WriteNewMessageButton instance = new WriteNewMessageButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static WriteNewMessageButton getSetNewMessageButtonInstance() {
        return instance;
    }


    // The method that the button implements
    public void newMessage() {

        JPanel mainPanelInstance = MainPanel.getMainPanelInstance();
        mainPanelInstance.remove(HomeScreen.getHomeScreenInstance());

        mainPanelInstance.add(AddHelpMessageScreen.getAddHelpMessageScreenInstance());
        mainPanelInstance.revalidate();
        mainPanelInstance.repaint();

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
