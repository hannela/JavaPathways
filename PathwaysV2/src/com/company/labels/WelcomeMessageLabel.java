package com.company.labels;

import com.company.utilities.ColorModes;

import javax.swing.*;

public class WelcomeMessageLabel extends JLabel {

    private WelcomeMessageLabel(){
        this.setText("<html><p>Welcome to Pathways!<br/> " +
                "You can customize your 'Help' button message to fit your needs.<br/> " +
                "Click the 'Write New Message' button to customize your HELP message.</p></html>");
        this.setSize(600, 200);
        this.setLocation(50, 50);
        this.setForeground(ColorModes.lightModeText);
        this.setVisible(true);
    }


    private static WelcomeMessageLabel instance = new WelcomeMessageLabel();

    public static WelcomeMessageLabel getWelcomeMessageLabelInstance() {
        return instance;
    }

}
