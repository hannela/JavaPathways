package com.company.utilities;

import javax.swing.*;
import java.awt.*;

public class ScreenUtilities {
    private ScreenUtilities() { }

    public static void setAllInvisible(JPanel panelToClear) {
        for (Component child : panelToClear.getComponents()) {
            child.setVisible(false);
        }
    }

    // Not currently necessary - may delete later
    public static JButton setButtonDetails(JButton button, int locX, int locY, int sizeW, int sizeL, Boolean visible) {
        button.setLocation(locX, locY);
        button.setSize(sizeW, sizeL);
        button.setVisible(visible);

        return button;
    }
}
