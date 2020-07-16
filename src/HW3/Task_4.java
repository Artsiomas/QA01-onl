package HW3;

import java.util.Arrays;
import java.util.Random;

public class Task_4 {
    public static void main(String[] args) {
        Random random = new Random();

        int massive[] = new int[20];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length; i++){
            if (massive[i] % 2 == 1) {
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
