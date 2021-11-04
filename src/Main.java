import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args){
        try {
            Frame test = new Frame();
        } catch (IOException e){
            System.out.println("could not start app" + e.getMessage());
        }
    }


}

