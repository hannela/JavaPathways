package com.company.buttons;

import com.company.screens.ShowRemindersScreen;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class ClearRemindersButton extends JButton {
    private ClearRemindersButton(){
        this.setSize(190, 30);
        this.setLocation(250, 400);
        this.setText("Clear Reminders");
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> clearReminders());
        this.setVisible(true);
    }

    private void clearReminders() {
        try{
        File fileToDelete = new File("reminders.txt");
        FileWriter fw = new FileWriter (fileToDelete);
        BufferedWriter bw = new BufferedWriter(fw); //Holds things in a buffer and feeds it in a rate that can be processed

        bw.append("");
        bw.close();
        fw.close();
        }catch (IOException e){
            System.out.println(e);
        }
        ShowRemindersScreen.getShowRemindersScreenInstance().getReminders();
    }

    private static ClearRemindersButton instance = new ClearRemindersButton();

    public static ClearRemindersButton getClearRemindersButtonInstance() {
        return instance;
    }
}
