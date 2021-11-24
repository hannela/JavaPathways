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
}
