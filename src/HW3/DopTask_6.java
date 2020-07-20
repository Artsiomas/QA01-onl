package HW3;

import java.util.Arrays;
import java.util.Random;

public class DopTask_6 {
    public static void main(String[] args) {
        int massive[] = new int[10];
        Random random = new Random();

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(massive));
        int b = 0;

        for (int i = 0; i < massive.length -1; i++) {
            if ( massive[i] == massive[i + 1]) {
                b++;
            }
        }

        if (b > 0 ) {
            System.out.println("Не все элементы массива различны");
        } else {
            System.out.println("се элементы массива различны");
        }
    }
}
