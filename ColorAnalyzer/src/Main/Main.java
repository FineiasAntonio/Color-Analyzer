package Main;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File image = new File("src\\Main\\Images\\clouds.jpg");

        try {
            List<Cor> ranking = Rank.rankear(ImageReader.lerPixels(image));
            System.out.println("Frequency of Colors");
            System.out.println("Archive: " + image.getName());
            System.out.println("-----------------------------");

            for (Cor cor : ranking) {
                System.out.println("Color(hex): " + cor.getCódigoCor() + " | " + String.format("%.2f", cor.getFrequency()) + "%");
            }
        } catch (IOException e) {
            System.out.println("Error! the archive may be corrupted or was not found");
        }
    }
}
