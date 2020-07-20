package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DopTask_3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int massive [] = new int [10];
    Random random = new Random();
    System.out.println("ведите число С: ");
        int c = scanner.nextInt();

        for (int i = 0; i < massive.length; i++) {
        massive[i] = random.nextInt(27);
        }
        System.out.println(Arrays.toString(massive));
        int count = 0;
        int sum = 0;
        for (int i = 0; i < massive.length; i++ ) {
            if (massive[i] > c) {
                sum += massive[i];
                count++;
            }
        }
        System.out.println(sum/count);
    }
}