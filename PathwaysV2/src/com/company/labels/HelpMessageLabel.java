package com.company.labels;
import com.company.buttons.DarkModeButton;
import com.company.utilities.ColorModes;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HelpMessageLabel extends JLabel{
    private HelpMessageLabel(){

        this.setText("testing testing");
        this.setSize(600, 345);
        this.setLocation(50, 50);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
        this.setHorizontalAlignment(JLabel.CENTER);

    }

    private static HelpMessageLabel instance = new HelpMessageLabel();

    public static HelpMessageLabel getHelpMessageLabelInstance() {
        return instance;
    }



}
