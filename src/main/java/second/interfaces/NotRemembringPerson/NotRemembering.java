package second.interfaces.NotRemembringPerson;

import lombok.Data;

import java.util.Arrays;

@Data
public class NotRemembering {
    private final double[][] mind;

    public NotRemembering(int set) {
        mind = new double[set][set];
        init();
    }

    public double[][] getMind() {
        return mind;
    }

    private void init() {
        for (int i = 0; i < this.mind.length; i++) {
            for (int j = 0; j < this.mind.length; j++) {
                mind[i][j] = Math.random();
                if (i == j) {
                    mind[i][j] = -1.0;
                }
            }
        }
    }


    public void printAll() {
        for (int j = 0; j < this.mind.length; j++) {
            for (double[] doubles : this.mind) {
                System.out.println(doubles[j]);
            }
        }
    }

    public void printTheSames() {
        System.out.println(mind[3][3]);
    }

    public void printOneRow() {
        for (int j = 0; j < this.mind.length; j++) {
            System.out.println(mind[0][j]);
        }
    }



    @Override
    public String toString() {
        return "NotRemembering{" +
                "mind=" + Arrays.toString(mind) +
                '}';
    }
}
