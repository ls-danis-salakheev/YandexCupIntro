package second;

import lombok.Data;
import second.interfaces.NotRemembringPerson.NotRememberingMain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
public class Championship {
    private NotRememberingMain champ;
    private static List<User> list = new ArrayList<>(2);

    public Championship(NotRememberingMain champ) {
        this.champ = champ;
    }


    public void toRememberAndGetWinner() {
        double[] mind = this.champ.getMind();
        boolean isSorted = false;
        double buffer;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i<mind.length-1; i++) {
                if (mind[i] >mind[i+1]) {
                    isSorted = false;
                    buffer =mind[i];
                    mind[i] = mind[i+1];
                    mind[i+1] = buffer;
                }
            }
        }
        System.out.println("Known 'abstract' users' skills: "+Arrays.toString(mind));

        list.add(new User(Levels.CHAMPION, mind[mind.length-1]));
        list.add(new User(Levels.SILVERCHAMPION, mind[mind.length-2]));
        list.add(new User(Levels.BRONZECHAMPION, mind[mind.length-3]));

        printChampions(list);
    }


    private void printChampions(List<User> users) {
        System.out.println("Today result is :");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }
}
