package HW3;


import java.util.Arrays;
import java.util.Random;

public class DopTask_8 {
    public static void main(String[] args) {
        Random random = new Random();
        int massive[] = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(massive));

        int max = massive[0];
        for ( int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
            }
        }

        int count = massive[0];
        for ( int i = 0; i < massive.length; i++) {
            if (max > massive[i]) {
                if (massive[i] > count) {
                    count = massive[i];
                }
            }
        }
        System.out.println(count);
    }
}
