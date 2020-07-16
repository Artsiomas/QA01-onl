package HW1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort_Massive_Search_Min_Max {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите значение: ");
        int a = scanner.nextInt();


        int massive [] = new int[a];


        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(massive));

        int min  = massive[0];
        int minInd = 0;
        int max  = massive[0];
        int maxInd = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i] < min) {
                min = massive[i];
                minInd = i;
            }
            if (massive[i] > max) {
                max = massive[i];
                maxInd = i;
            }
        }
        System.out.println(min);
        System.out.println(max);

        massive[maxInd] = min;
        massive[minInd] = max;
            System.out.println(Arrays.toString(massive));

    }
}
