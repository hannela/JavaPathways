package com.company.screens;

import com.company.buttons.*;
import com.company.textfields.AddHelpMessageTextField;
import com.company.utilities.ColorModes;
import com.company.utilities.LabelFactory;

import javax.swing.*;

public class AddHelpMessageScreen extends JPanel {
    // This creates an instance of the panel.
    private static AddHelpMessageScreen instance = new AddHelpMessageScreen();

    // The method to get an instance (the copy) of the panel.
    // All instances point to the same copy of the panel.
    public static AddHelpMessageScreen getAddHelpMessageScreenInstance() {
        return instance;
    }

    JLabel addHelpMessageInstructionsText;
    JTextField addHelpMessageTextField = AddHelpMessageTextField.getAddHelpMessageTextFieldInstance();
    JButton saveHelpMessageButton = SaveHelpMessageButton.getSaveHelpMessageButtonInstance();
    JButton backButton = BackButtonNewMessageToHomeScreen.getBackButtonNewMessageToHomeScreenInstance();
    JButton darkModeButton = DarkModeButton.getDarkModeButtonInstance();
    JButton lightModeButton = LightModeButton.getLightModeButtonInstance();

    // private constructor
    private AddHelpMessageScreen(){
        this.setSize(700, 550);
        this.setLayout(null); // No layout manager
        this.setOpaque(false); // makes panel transparent

        addHelpMessageInstructionsText = LabelFactory.getLabel(300, 40, 275, 115, "Write 'Help' message here:", ColorModes.lightModeText);
        this.add(addHelpMessageInstructionsText);

        this.add(backButton);
        this.add(addHelpMessageTextField);
        this.add(saveHelpMessageButton);
//        this.add(lightModeButton);
//        this.add(darkModeButton);
    }
}
