package com.company;

import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {
    private Buttons() { }

    // save Reminder Button
     public static JButton saveMessageButton = makeStaticButton(515, 150, 70, 30, "Save", ColorModes.lightModeText,
                    (ActionEvent e) -> saveMessage(), false);

    public static void saveMessage() {
        // helpMessage = inputTF.getText(); < input text field
        // inputTF.setVisible(false);
        // instructions.setVisible(false); < label
        //saveButton.setVisible(false);
//        messageB.setVisible(true);
//        messageB.setEnabled(true);
//        newMessageB.setVisible(true);
//        clickL.setVisible(true);
    }

    // colors

    // public static lightModeButton()
    // public static darkModeButton()
    // public static backButton()
    // public static addReminder()
    // public static displayHelpMessageButton()

    public static JButton makeStaticButton(int theX, int theY, int theWidth,
                                           int theHeight, String theText, Color theForeground,
                                           ActionListener theHandler, Boolean visibilityStatus) {
        JButton toReturn = new JButton(theText);
        toReturn.setSize(theWidth, theHeight);
        toReturn.setLocation(theX, theY);
        toReturn.setForeground(theForeground);
        // myCP.add(toReturn);
        toReturn.addActionListener(theHandler);
        toReturn.setVisible(visibilityStatus);
        return toReturn;
    }//makeButton

}
