package HW3;

import java.util.Arrays;
import java.util.Random;

public class    Task_7 {
    public static void main(String[] args) {
        int massive [] = new int[12];
        Random random = new Random();


        for(int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(massive));
        int max = massive[0];

        int maxIndex = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= max) {
                max = massive[i];
                maxIndex = i;
            }
        }
        System.out.println(" Максимальный индекс: " + maxIndex);
    }
}
