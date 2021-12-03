package com.company.buttons;

import com.company.MainPanel;
import com.company.screens.HomeScreen;
import com.company.screens.ShowRemindersScreen;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ShowRemindersButton extends JButton {

    private ShowRemindersButton(){
        this.setSize(190, 30);
        this.setLocation(250, 400);
        this.setText("Display Reminders");
        this.setForeground(ColorModes.lightModeText);
        this.addActionListener((ActionEvent e) -> showReminders());
        this.setVisible(true);
    }

    private static ShowRemindersButton instance = new ShowRemindersButton();

    public static ShowRemindersButton getShowRemindersButtonInstance() {
        return instance;
    }

    public void showReminders(){
        JPanel mainPanelInstance = MainPanel.getMainPanelInstance();
        mainPanelInstance.remove(HomeScreen.getHomeScreenInstance());

        mainPanelInstance.add(ShowRemindersScreen.getShowRemindersScreenInstance());
        mainPanelInstance.revalidate();
        mainPanelInstance.repaint();
        ShowRemindersScreen.getShowRemindersScreenInstance().getReminders();
    }
}
