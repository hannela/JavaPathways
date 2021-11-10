package com.company;
import java.awt.*; // for original GUI stuff
import java.awt.event.*; // for event handling
import javax.swing.*; //for swing GUI stuff

public class Screen<JContentPane> extends JFrame {

    private JLabel instructions;

    private JTextField inputTF;

    private JButton inputB;

    private String helpMessage;

    private JLabel messageL;

    private JLabel welcomeL;

    private JLabel clickL;

    private JButton messageB;

    private JButton newMessageB;

    private JButton backB;

    private Container myCP;

    private JButton colorMode;

    public Screen() {
        super("Java Pathways: Help Message");
        setSize(700, 550);
        setLocation(100, 100);
        myCP = getContentPane();
        myCP.setLayout(null);//there is no layout manager
        myCP.setBackground(new Color(235, 200, 255));

        clickL = makeLabel(290, 150, 190, 30, "Click 'Help' button!", Color.MAGENTA);

        welcomeL = makeLabel(50, 50, 600, 200, "<html><p>Welcome to Pathways!<br/> " +
                "You can customize your 'Help' button message to fit your needs.<br/> " +
                "Click the 'Write New Message' button to customize your HELP message.</p></html>", Color.MAGENTA);
        welcomeL.setHorizontalAlignment(JLabel.CENTER);
        welcomeL.setFont(new Font("Serif",Font.PLAIN,20));
        welcomeL.setVisible(false);

        instructions = makeLabel(275, 115, 300, 40, "Write 'Help' message here:", Color.MAGENTA);
        instructions.setVisible(false);

        inputTF = makeTextField(200, 150, 300, 30, Color.BLACK);
        inputTF.setVisible(false);

        inputB = makeButton(515, 150, 55, 30, "Save", Color.MAGENTA,
                (ActionEvent e) -> saveMessage());
        inputB.setVisible(false);

        messageB = makeButton(300, 200, 100, 40, "Help Message", Color.MAGENTA,
                (ActionEvent e) -> displayMessage());

        newMessageB = makeButton(490, 450, 190, 30, "Write New Message", Color.MAGENTA,
                (ActionEvent e) -> newMessage());

        backB = makeButton(490, 400, 190, 30, "<- Back   ", Color.MAGENTA,
                (ActionEvent e) -> back());
        backB.setVisible(false);

        messageL = makeLabel(50, 50, 600, 345, "", Color.BLACK);
        messageL.setHorizontalAlignment(JLabel.CENTER);
        messageL.setVisible(false);


        colorMode = makeButton(490, 400, 190, 30, "dark mode", Color.DARK_GRAY,
                (ActionEvent e) -> changeColor());
        setVisible(true);


        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }//windowClosing
        });
    }

    private void changeColor() {
        myCP.setBackground(Color.DARK_GRAY);
        instructions.setForeground(Color.BLACK);

        inputTF.setForeground(Color.BLACK);

        inputB.setForeground(Color.BLACK);

        messageL.setForeground(Color.BLACK);

        welcomeL.setForeground(Color.BLACK);

        clickL.setForeground(Color.BLACK);

        messageB.setForeground(Color.BLACK);

        newMessageB.setForeground(Color.BLACK);

        backB.setForeground(Color.BLACK);

        myCP.setForeground(Color.BLACK);
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
        inputB.setVisible(true);
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
            inputB.setVisible(false);
            messageB.setVisible(true);
            clickL.setVisible(true);
            newMessageB.setVisible(true);
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
        inputB.setVisible(false);
        messageB.setVisible(true);
        messageB.setEnabled(true);
        newMessageB.setVisible(true);
        clickL.setVisible(true);
    }


    private JButton makeButton(int theX, int theY, int theWidth,
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
}