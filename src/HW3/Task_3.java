package HW3;

import java.util.Arrays;
import java.util.Random;

public class Task_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;

        int massive [] = new int[15];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(99);
        }
        System.out.println(Arrays.toString(massive));
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                count++;
            }
         }
        System.out.println(count);
    }
}
