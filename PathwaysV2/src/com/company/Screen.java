package com.company;

import java.awt.*; // for original GUI stuff
import java.awt.event.*; // for event handling
import javax.swing.*; //for swing GUI stuff

public class Screen<JContentPane> extends JFrame {

    private JLabel instructions;

    //help message input field
    private JTextField inputTF;

    private JButton saveButton;

    private String helpMessage;

    //displays written in message
    private JLabel messageL;

    //welcome info/how to
    private JLabel welcomeL;

    //direction to click help button to display user message
    private JLabel clickL;

    //button to display user message
    public static JButton messageB;

    //button to write in user help message
    private JButton newMessageB;

    //back button
    private JButton backB;
    
    private Container myCP;

    private JButton darkModeButton;

    private JButton lightModeButton;

    private JButton reminders;

    private boolean lightModeFlag = true;



    // new added
    //constants that can be called
    private static Color darkModeBackground = Color.DARK_GRAY;

    private static Color darkModeText = Color.BLACK;

    private static Color lightModeBackground = new Color(235, 200, 255);

    private static Color lightModeText = Color.MAGENTA;

    private JLabel reminderInstructions;

    private static String reminderInstructionsString = "Enter a new reminder.";

    public Screen() {
        super("Java Pathways: Help Message");
        setSize(700, 550);
        setLocation(100, 100);
        myCP = getContentPane();
        myCP.setLayout(null);//there is no layout manager
        //myCP.setBackground(new Color(235, 200, 255));
        myCP.setBackground(lightModeBackground);

        clickL = makeLabel(290, 150, 190, 30, "Click 'Help' button!", lightModeText);

        reminderInstructions = makeLabel(50, 50, 600, 345, reminderInstructionsString, darkModeText);
        reminderInstructions.setHorizontalAlignment(JLabel.CENTER);
        reminderInstructions.setVisible(false);

        welcomeL = makeLabel(50, 50, 600, 200, "<html><p>Welcome to Pathways!<br/> " +
                "You can customize your 'Help' button message to fit your needs.<br/> " +
                "Click the 'Write New Message' button to customize your HELP message.</p></html>", lightModeText);
        welcomeL.setHorizontalAlignment(JLabel.CENTER);
        welcomeL.setFont(new Font("Serif",Font.PLAIN,20));
        welcomeL.setVisible(false);

        instructions = makeLabel(275, 115, 300, 40, "Write 'Help' message here:", lightModeText);
        instructions.setVisible(false);

        inputTF = makeTextField(200, 150, 300, 30, darkModeText);
        inputTF.setVisible(false);

        saveButton = makeButton(515, 150, 70, 30, "Save", lightModeText,
                (ActionEvent e) -> saveMessage());
        saveButton.setVisible(false);

        messageB = makeButton(250, 200, 200, 40, "Help Message", lightModeText,
                (ActionEvent e) -> displayMessage());

        newMessageB = makeButton(490, 400, 190, 30, "Write New Message", lightModeText,
                (ActionEvent e) -> newMessage());

        backB = makeButton(490, 450, 190, 30, "<- Back   ", lightModeText,
                (ActionEvent e) -> back());
        backB.setVisible(false);

        messageL = makeLabel(50, 50, 600, 345, "", darkModeText);
        messageL.setHorizontalAlignment(JLabel.CENTER);
        messageL.setVisible(false);


        darkModeButton = makeButton(490, 350, 190, 30, "dark mode", darkModeBackground,
                (ActionEvent e) -> darkMode()); //ColorModes.switchColorsDark(this));
        setVisible(true);

        lightModeButton = makeButton(490, 350, 190, 30, "light mode", lightModeText,
                (ActionEvent e) -> lightMode());
        setVisible(false);

        reminders = makeButton(250, 450, 190, 30, "Create New Reminder", lightModeText,
                (ActionEvent e) -> makeReminder());
        reminders.setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }//windowClosing
        });
    }

    private void makeReminder() {
        blankScreen();
        inputTF.setVisible(true);
        saveButton.setVisible(true);
        reminderInstructions.setVisible(true);
        inputTF.setText("");
        backB.setVisible(true);
    }

    public void darkMode() {

        lightModeFlag = false;
        lightModeButton.setVisible(true);
        darkModeButton.setVisible(false);

        myCP.setBackground(darkModeBackground);
        instructions.setForeground(darkModeText);

        inputTF.setForeground(darkModeText);

        //saveButton.setForeground(darkModeText);

        messageL.setForeground(darkModeText);

        welcomeL.setForeground(darkModeText);

        clickL.setForeground(darkModeText);

        messageB.setForeground(darkModeText);

        newMessageB.setForeground(darkModeText);

        backB.setForeground(darkModeText);

        myCP.setForeground(darkModeText);
    }

    private void lightMode() {
        lightModeFlag = true;
        lightModeButton.setVisible(false);
        darkModeButton.setVisible(true);
        myCP.setBackground(lightModeBackground);
        instructions.setForeground(lightModeText);

        inputTF.setForeground(lightModeText);

        //saveButton.setForeground(lightModeText);

        messageL.setForeground(lightModeText);

        welcomeL.setForeground(lightModeText);

        clickL.setForeground(lightModeText);

        messageB.setForeground(lightModeText);

        newMessageB.setForeground(lightModeText);

        backB.setForeground(lightModeText);

        myCP.setForeground(lightModeText);
    }


    public void displayMessage() {
        if (inputTF.getText().equals("") && messageL.getText().equals("")) {
            welcomeL.setVisible(true);
            clickL.setVisible(false);
            messageB.setEnabled(false);
        } else {
            messageB.setVisible(false);
            messageL.setVisible(true);
            messageL.setText("<html><p>" + helpMessage + "</p></html>");
            backB.setVisible(true);
            clickL.setVisible(false);
        }
    }

    public void newMessage() {
        welcomeL.setVisible(false);
        inputTF.setVisible(true);
        instructions.setVisible(true);
        //saveButton.setVisible(true);
        messageB.setVisible(false);
        messageL.setVisible(false);
        newMessageB.setVisible(false);
        clickL.setVisible(false);
        inputTF.setText("");
        backB.setVisible(true);

    }

    public void back() {
        if (inputTF.isVisible()) {
            inputTF.setVisible(false);
            instructions.setVisible(false);
            //saveButton.setVisible(false);
            messageB.setVisible(true);
            clickL.setVisible(true);
            newMessageB.setVisible(true);
            reminderInstructions.setVisible(false);
        } else {
            messageB.setVisible(true);
            clickL.setVisible(true);
            messageL.setVisible(false);
        }
    }

    public void saveMessage() {
        helpMessage = inputTF.getText();
        inputTF.setVisible(false);
        instructions.setVisible(false);
        //saveButton.setVisible(false);
        messageB.setVisible(true);
        messageB.setEnabled(true);
        newMessageB.setVisible(true);
        clickL.setVisible(true);
    }


    public JButton makeButton(int theX, int theY, int theWidth,
                               int theHeight, String theText, Color theForeground,
                               ActionListener theHandler) {
        JButton toReturn = new JButton(theText);
        toReturn.setSize(theWidth, theHeight);
        toReturn.setLocation(theX, theY);
        toReturn.setForeground(theForeground);
         myCP.add(toReturn);
        toReturn.addActionListener(theHandler);
        return toReturn;
    }//makeButton

    private JLabel makeLabel(int theX, int theY, int theWidth, int theHeight
            , String theText, Color theForeground) {
        JLabel toReturn = new JLabel(theText);
        toReturn.setSize(theWidth, theHeight);
        toReturn.setLocation(theX, theY);
        toReturn.setForeground(theForeground);
        myCP.add(toReturn);
        return toReturn;
    }//makeLabel

    private JTextField makeTextField(int theX, int theY, int theWidth,
                                     int theHeight, Color theForeground) {
        JTextField toReturn = new JTextField("");
        toReturn.setSize(theWidth, theHeight);
        toReturn.setLocation(theX, theY);
        toReturn.setForeground(theForeground);
        myCP.add(toReturn);
        return toReturn;
    }//makeTextField

    private void blankScreen() {

        for (Component child : myCP.getComponents()) {
            child.setVisible(false);
        }

        if (lightModeFlag){
            lightModeButton.setVisible(true);
        }
        else{
            darkModeButton.setVisible(true);
        }


    }
}