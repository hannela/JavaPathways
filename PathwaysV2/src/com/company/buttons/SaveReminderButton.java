package com.company.buttons;

import com.company.textfields.AddReminderTextField;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Extends JButton tells the program that this is a JButton with a customized class name.
public class SaveReminderButton extends JButton {

    // Build the button in the constructor.
    private SaveReminderButton() {
        this.setText("Save");
        this.setSize(70, 30);
        this.setLocation(515, 150);
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> saveReminder());
        this.setVisible(true);
    }

    // This creates an instance of the button.
    private static SaveReminderButton instance = new SaveReminderButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static SaveReminderButton getSaveReminderButtonInstance() {
        return instance;
    }

    // The method that the button implements
    public void saveReminder() {
       JTextField reminderTextField = AddReminderTextField.getAddReminderTextFieldInstance();
        try{
            String reminder = reminderTextField.getText();
            File myObj = new File("reminders.txt");
            myObj.createNewFile();
            FileWriter fw = new FileWriter (myObj, true);
            BufferedWriter bw = new BufferedWriter(fw); //Holds things in a buffer and feeds it in a rate that can be processed

            bw.append(reminder + "\n");
            bw.close();
            fw.close();
        } catch (IOException e){
            System.out.println("An error occured :(");
            e.printStackTrace();
        }
        reminderTextField.setText("");
    }
}
