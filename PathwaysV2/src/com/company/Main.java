package com.company;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Screen test = new Screen();
        test.setVisible(true);
        reminders("reminder");
    }

    private static void reminders(String reminder) {
        try{
            String testString = "test";
            File myObj = new File("reminders.txt");
            myObj.createNewFile();
            FileWriter fw = new FileWriter (myObj);
            BufferedWriter bw = new BufferedWriter(fw); //Holds things in a buffer and feeds it in a rate that can be processed

            bw.write(reminder + "\n");
            bw.write(testString);
            bw.close();
            fw.close();
        } catch (IOException e){
            System.out.println("An error occured :(");
            e.printStackTrace();
        }



    }
}