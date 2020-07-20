package HW4;

import java.util.Random;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число, указывающее размер матрицы: ");
        int a = scanner.nextInt();
        int massive[][] = new int[a][a];

        for( int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++){
                massive[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for ( int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                if (j <= i) {
                    if (massive[i][j] % 2 != 0) {
                        System.out.print(massive[i][j] + " ");
                    }
                }
            }
        }
    }
}
