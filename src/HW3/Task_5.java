package HW3;

import java.util.Arrays;
import java.util.Random;

public class Task_5 {
    public static void main(String[] args) {
        Random random = new Random();

        int massive[] = new int[5];
        int massiveSecond[] = new int[5];

        int sum = 0;
        int sumSecond = 0;

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
            sum += massive[i];
        }
        System.out.println(Arrays.toString(massive));

        for (int b = 0; b < massiveSecond.length; b++) {
            massiveSecond[b] = random.nextInt(15);
            sumSecond += massiveSecond[b];
        }
        System.out.println(Arrays.toString(massiveSecond));

        if (sum > sumSecond) {
                System.out.println("Ср арифмитическое 1-го массива: " + sum + " больше, чем ср. арифмитическое 2-го массива: " + sumSecond);
        } else if (sumSecond > sum ) {
            System.out.println("Ср арифмитическое 2-го массива: " + sumSecond + " больше, чем ср. арифмитическое 1-го массива: " + sum);
        } else {
                System.out.println("Ср арифмитическое 2-го массива: " + sumSecond + " равно ср. арифмитическое 1-го массива: " + sum);
        }
    }
}