package com.company.buttons;

import com.company.MainPanel;
import com.company.screens.AddHelpMessageScreen;
import com.company.screens.AddReminderScreen;
import com.company.screens.HomeScreen;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddReminderButton extends JButton {
    private AddReminderButton(){
        this.setSize(190, 30);
        this.setLocation(250, 450);
        this.setText("Add New Reminder");
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> addReminder());
        this.setVisible(true);
    }
    // This creates an instance of the button.
    private static AddReminderButton instance = new AddReminderButton();

    // The method to get an instance (the copy) of the button.
    // All instances point to the same copy of the button.
    // If you change the button on one screen, it will affect it on all screens.
    // Ex. if you setVisible(true), the button will remain visible on all screens until turned off.
    public static AddReminderButton getAddReminderButtonInstance() {
        return instance;
    }


    public void addReminder(){
        JPanel mainPanelInstance = MainPanel.getMainPanelInstance();
        mainPanelInstance.remove(HomeScreen.getHomeScreenInstance());

        mainPanelInstance.add(AddReminderScreen.getAddReminderScreenInstance());
        mainPanelInstance.revalidate();
        mainPanelInstance.repaint();}
}
