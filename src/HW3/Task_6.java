package HW3;

import java.util.Arrays;
import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        int massive [] = new int[4];
        Random random = new Random();

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(massive));


            if (massive[0] < massive[1] && massive [1] < massive[2] && massive[2] < massive[3]) {
                System.out.println("Данная последовательность является возрастающей");
            } else {
                System.out.println("Данная послеовательность не является возрастающей");
            }
    }
}
