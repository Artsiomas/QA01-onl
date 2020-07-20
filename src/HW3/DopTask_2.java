package HW3;

import java.util.Arrays;
import java.util.Random;

public class DopTask_2 {
    public static void main(String[] args) {
        int massive [] = new int [10];
        Random random = new Random();

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(27);
        }

        int index = 0;
        int mean = 0;

        for (int i = 0; i < massive.length; i ++) {
            if (i % 2 != 0) {
                mean += massive[i];
            index++;
            }
        }
        System.out.println(mean/index);
    }
}
