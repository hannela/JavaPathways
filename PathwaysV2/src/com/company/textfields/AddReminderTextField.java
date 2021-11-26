package com.company.textfields;

import com.company.utilities.ColorModes;

import javax.swing.*;

public class AddReminderTextField extends JTextField {
    private AddReminderTextField(){
        this.setSize(300, 30);
        this.setLocation(200,150);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
    }

    private static AddReminderTextField instance = new AddReminderTextField();

    public static AddReminderTextField getAddReminderTextFieldInstance(){return instance;}
}
