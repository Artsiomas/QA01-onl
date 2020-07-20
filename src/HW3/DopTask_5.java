package HW3;

import java.util.Arrays;
import java.util.Random;

public class DopTask_5 {
    public static void main(String[] args) {
        int massive[] = new int[10];
        Random random = new Random();

        for ( int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(27);
        }

        System.out.println(Arrays.toString(massive));

        for (int i = 0; i < massive.length; i ++) {
            if ( i % 2 != 0) {
                massive[i] = 0;
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
