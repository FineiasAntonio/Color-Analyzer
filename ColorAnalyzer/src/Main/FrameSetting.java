package Main;

import java.awt.FileDialog;
import java.awt.Frame;
import javax.swing.JOptionPane;

public class FrameSetting {

    public static String chooseFile(){
        FileDialog chooser = new FileDialog(new Frame(), "Select a file", FileDialog.LOAD);
        chooser.setVisible(true);
        return chooser.getDirectory() + chooser.getFile();
    }

    public static void Error(String s){
        JOptionPane.showMessageDialog(new Frame(), s, "Error", JOptionPane.ERROR_MESSAGE);
    }
}