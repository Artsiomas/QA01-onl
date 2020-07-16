package HW3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Введите положительно число: ");
        int a = scanner.nextInt();
        if ( a < 0) {
            System.out.println("Ваше число не положительное. Запустите программу заново и введите положительное число");
        }
        int massive [] = new int [a];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = random.nextInt(15);
        }
        System.out.println(Arrays.toString(massive));

        int halfMas = massive.length/2;
        int firstHalf = 0;
        int secondHalf = 0;

        for (int i = 0; i < halfMas; i++) {
            firstHalf += massive[i];
        }

        for (int i = halfMas - 1; i < massive.length; i++) {
            secondHalf += massive[i];
        }

        if (firstHalf < secondHalf) {
            System.out.println(firstHalf + " < " + secondHalf);
        } else if (secondHalf > firstHalf){
            System.out.println(secondHalf + " > " + firstHalf);
        } else {
            System.out.println(secondHalf + " = " + firstHalf);
        }

    }
}
