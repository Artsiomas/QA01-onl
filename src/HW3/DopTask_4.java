package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DopTask_4 {
    public static void main(String[] args) {
        Random random = new Random();
        int massive [] = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(25);
        }
        System.out.println(Arrays.toString(massive));

        int min = massive[0];
        for (int i = 0; i < massive.length; i ++) {
            if (massive[i] % 2 !=0) {
                if (massive[i] < min) {
                    min = massive[i];
                }
            }
        }
        System.out.println(min);
    }
}
