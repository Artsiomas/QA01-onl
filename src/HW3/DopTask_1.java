package HW3;

import java.util.Arrays;
import java.util.Random;

public class DopTask_1 {
    public static void main(String[] args) {
        int massive [] = new int [10];
        Random random = new Random();

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(27);
        }
        int composition = 1;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 3 == 0) {
                composition *= massive[i];
            }
        }
        System.out.println(Arrays.toString(massive));
        System.out.println(composition);
    }
}
