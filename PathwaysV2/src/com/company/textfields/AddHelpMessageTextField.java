package com.company.textfields;

import com.company.utilities.ColorModes;

import javax.swing.*;

public class AddHelpMessageTextField extends JTextField {
    private AddHelpMessageTextField(){
        this.setSize(300, 30);
        this.setLocation(200,150);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
    }

    private static AddHelpMessageTextField instance = new AddHelpMessageTextField();

    public static AddHelpMessageTextField getAddHelpMessageTextFieldInstance(){return instance;}
}
