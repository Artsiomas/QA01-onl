package HW3;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Random;

public class DopTask_7 {
    public static void main(String[] args) {
        int number = 7;

        Random random = new Random();
        int massive[] = new int[10];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(8);
        }
        System.out.println(Arrays.toString(massive));

        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] == number) {
                count++;
            }
        }
        System.out.println("Число " + number + " встречается в масииве " + count + " раз");
    }
}
