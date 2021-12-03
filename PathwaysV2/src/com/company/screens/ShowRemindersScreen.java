package com.company.screens;

import com.company.buttons.BackButtonShowRemindersToHomeScreen;
import com.company.buttons.ClearRemindersButton;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ShowRemindersScreen extends JPanel {

    JButton backButton = BackButtonShowRemindersToHomeScreen.getBackButtonShowRemindersToHomeScreenInstance();
    JTextArea reminders = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(reminders);

    JButton clearReminders = ClearRemindersButton.getClearRemindersButtonInstance();
    private ShowRemindersScreen(){
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent

        scrollPane.setSize(new Dimension(700, 400));
        scrollPane.setVisible(true);
        this.add(scrollPane);

        reminders.setEditable(false);

        this.add(backButton);
        this.add(clearReminders);
    }

    private static ShowRemindersScreen instance = new ShowRemindersScreen();

    public static ShowRemindersScreen getShowRemindersScreenInstance() {
        return instance;
    }

    public void getReminders(){
        try{
            reminders.setText("");
            Scanner input = new Scanner(new File("reminders.txt"));
            while(input.hasNextLine()){
                reminders.append(input.nextLine());
                reminders.append("\n");
            }
        } catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
