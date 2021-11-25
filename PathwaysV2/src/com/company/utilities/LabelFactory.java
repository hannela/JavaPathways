package com.company.utilities;

import javax.swing.*;
import java.awt.Color;

// static class to create labels
public class LabelFactory {
    private LabelFactory(){};

    public static JLabel getLabel(int width, int height, int x, int y, String text, Color textColor){
        JLabel label = new JLabel();
        label.setSize(width, height);
        label.setLocation(x, y);
        label.setText(text);
        label.setForeground(textColor);
        return label;
    }
}
