package Main;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

import javax.imageio.ImageIO;

public class ImageReader {

public static List<Cor> lerPixels(File image) throws IOException{
    HashMap<String, Integer> ColorMap = new HashMap<>();
    List<Cor> coresList = new LinkedList<>();
    
            BufferedImage bufferedImage = ImageIO.read(image);
            final long TAM = bufferedImage.getWidth()*bufferedImage.getHeight();
            Function<String, Integer> verificar = (key -> !ColorMap.containsKey(key)?1:ColorMap.get(key) + 1);

            for(int i = 1; i < bufferedImage.getWidth(); i++){
                for(int j = 1; j < bufferedImage.getHeight(); j++){
                    
                    Cor corInput = new Cor(Cor.toHex(bufferedImage.getRGB(i, j)));
                    


                    ColorMap.put(corInput.getCódigoCor(), verificar.apply(corInput.getCódigoCor()));
                }
            }
            
            for (HashMap.Entry<String, Integer> entry : ColorMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            coresList.add(new Cor(key, value,(float) value*100/TAM));

        }
        bufferedImage.flush();

        return coresList;
    }

    public static String ValueAproximation(String color) {
        String red = color.substring(0, 1);
        String green = color.substring(2, 3);
        String blue = color.substring(4,5);

        return "O JOGO FIlhO DA PUTA";
    }
}
