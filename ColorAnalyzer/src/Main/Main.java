package Main;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        File image = new File(FrameSetting.chooseFile());

        try {
            List<Cor> ranking = ImageReader.lerPixels(image).stream()
                                                            .sorted(Cor::compareTo)
                                                            .limit(10)
                                                            .collect(Collectors.toList());

            setFrRel(ranking);

            System.out.println("Frequency of Colors");
            System.out.println("File: " + image.getName());
            System.out.println("-----------------------------");

            for (Cor cor : ranking) {
                System.out.println("Color(hex): " + cor.getCódigoCor() + " | " + String.format("%.2f", cor.getFrequency()) + "%");
            }
            
        } catch (IOException e) {
            FrameSetting.Error("Error! the file may be corrupted or was not found");
            System.exit(0);
        } catch (NullPointerException e) {
            FrameSetting.Error("Error! you must select a file with a valid image extension");
            System.exit(0);
        }

        System.exit(0);
    }

    public static void setFrRel(List<Cor> list){
        
        float frAbs = 0;
        for (Cor cor : list) {
            frAbs += cor.getFrequency();
        }

        for (Cor cor : list) {
            cor.setFrequency((cor.getFrequency()*100)/frAbs);
        }
    }
}
