package HW3;

import java.util.Arrays;
import java.util.Random;

public class DopTask_10 {
    public static void main(String[] args) {
        Random random = new Random();
        int massive[] = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
        }
System.out.println(Arrays.toString(massive));

        int c = 0;
        int max = massive[0];
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > max) {
                max = massive[i];
                c = i;
            }
        }

        int a = massive[c];
        massive[c] = massive[0];
        massive[0] = a;
        System.out.println(Arrays.toString(massive));
    }
}
