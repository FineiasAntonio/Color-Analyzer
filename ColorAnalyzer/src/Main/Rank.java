package Main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Rank {
    public static List<Cor> rankear(List<Cor> listInput){
        listInput.sort(Collections.reverseOrder((o1, o2) -> Integer.compare(o1.getQuantidade(), o2.getQuantidade())));

        List<Cor> ranking = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            ranking.add(listInput.get(i));
        }
         
        return ranking;
    }
}
