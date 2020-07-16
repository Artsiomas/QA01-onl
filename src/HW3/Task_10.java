package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Введите число больше 3: ");
        int n = scanner.nextInt();
        if (n < 3) {
            System.out.println("Введенное число меньше 3. Обновите программу и введите число заново. ");
        }

        int massive [] = new int[n];
        for (int i = 0; i < massive.length; i++ ) {
            massive[i] = random.nextInt(n);
        }
        System.out.println(Arrays.toString(massive));

        int count = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                count++;
            }
        }


        int massiveSecond  [] = new int[count];

        int b = 0;
        for (int i = 0; i < massiveSecond.length; i++) {
            if (massive[i] % 2 == 0){
                    massiveSecond[b] = massive[i];
                    b++;
            }
        }
        System.out.println(Arrays.toString(massiveSecond));
    }
}
