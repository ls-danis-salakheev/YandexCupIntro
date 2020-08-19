package second.interfaces.NotRemembringPerson;

import lombok.Data;

import java.util.Arrays;

@Data
public class NotRememberingMain {
    private final double[] mind;

    public NotRememberingMain(int set) {
        mind = new double[set];
        init();
    }

    public double[] getMind() {
        return mind;
    }

    private void init() {
        for (int i = 0; i < this.mind.length; i++) {
            {
                mind[i] = Math.random();
            }
        }
    }


    public void printAll() {
        System.out.println(Arrays.toString(mind));
    }

    @Override
    public String toString() {
        return "NotRemembering{" +
                "mind=" + Arrays.toString(mind) +
                '}';
    }
}
