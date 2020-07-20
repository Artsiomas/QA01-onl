package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class MainTaskGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstPlayer = 1;
        int secondPlayer = 7;
        int nFirst = firstPlayer * 3;
        int nSecond = secondPlayer * 3;
        int a = 0;
        int b = 0;

        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        int sum7 = 0;
        int sum8 = 0;

        int massive[][] = new int[3][3];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                massive[i][j] = 0;
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
// 1-ый ход Игрок 1
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }
            if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
                massive[a - 1][b - 1] = firstPlayer;
            }
        }

            if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
                massive[a - 1][b - 1] = firstPlayer;
            }



            for (int i = 0; i < massive.length; i++) {
                for (int j = 0; j < massive.length; j++) {
                    System.out.print(massive[i][j] + " ");
                }
                System.out.println();
            }



            // 1- ый ход игрок номер 2
        System.out.println("Ход игрока номер 2.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = secondPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }



        // 2-ой Ход игрока номер 1
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = firstPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }



        // 2-ой Ход игрока номер 2
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = secondPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }


        // 3-ий Ход игрока номер 1
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = firstPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

        // Проверка выигрыша
        for ( int i = 0; i < massive.length;i++)  {
            for ( int j = 0; j < massive.length; j++) {
                if (i == 0) {
                    sum1 += massive[i][j];
                }
                if ( i == 1) {
                    sum2 += massive[i][j];
                }
                if ( i == 2) {
                    sum3 += massive[i][j];
                }
                if ( j == 0 ) {
                    sum4 += massive[i][j];
                }
                if ( j == 1 ) {
                    sum5 += massive[i][j];
                }
                if ( j == 2 ) {
                    sum6 += massive[i][j];
                }
                if (i + j == a - 1) {
                    sum7 += massive[i][j];
                }
                if (i == j) {
                    sum8 += massive[i][j];
                }

            }
        }


        if (sum1 == nFirst || sum2 == nFirst || sum3 == nFirst || sum4 == nFirst || sum5 == nFirst || sum6 == nFirst || sum7 == nFirst || sum8 == nFirst) {
            System.out.println("Первый игрок выиграл");
            System.exit(0);
        }
        if (sum1 == nSecond || sum2 == nSecond || sum3 == nSecond || sum4 == nSecond || sum5 == nSecond || sum6 == nSecond || sum7 == nSecond || sum8 == nSecond) {
            System.out.println("Второй игрок выиграл");
            System.exit(0);
        }



        // 3-ий Ход игрока номер 2
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = secondPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }


        // Проверка выигрыша
        // Проверка выигрыша
        for ( int i = 0; i < massive.length;i++)  {
            for ( int j = 0; j < massive.length; j++) {
                if (i == 0) {
                    sum1 += massive[i][j];
                }
                if ( i == 1) {
                    sum2 += massive[i][j];
                }
                if ( i == 2) {
                    sum3 += massive[i][j];
                }
                if ( j == 0 ) {
                    sum4 += massive[i][j];
                }
                if ( j == 1 ) {
                    sum5 += massive[i][j];
                }
                if ( j == 2 ) {
                    sum6 += massive[i][j];
                }
                if (i + j == a - 1) {
                    sum7 += massive[i][j];
                }
                if (i == j) {
                    sum8 += massive[i][j];
                }

            }
        }


        if (sum1 == nFirst || sum2 == nFirst || sum3 == nFirst || sum4 == nFirst || sum5 == nFirst || sum6 == nFirst || sum7 == nFirst || sum8 == nFirst) {
            System.out.println("Первый игрок выиграл");
            System.exit(0);
        }
        if (sum1 == nSecond || sum2 == nSecond || sum3 == nSecond || sum4 == nSecond || sum5 == nSecond || sum6 == nSecond || sum7 == nSecond || sum8 == nSecond) {
            System.out.println("Второй игрок выиграл");
            System.exit(0);
        }

        // 4-ый Ход игрока номер 1
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = firstPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }



        // Проверка выигрыша
        // Проверка выигрыша
        for ( int i = 0; i < massive.length;i++)  {
            for ( int j = 0; j < massive.length; j++) {
                if (i == 0) {
                    sum1 += massive[i][j];
                }
                if ( i == 1) {
                    sum2 += massive[i][j];
                }
                if ( i == 2) {
                    sum3 += massive[i][j];
                }
                if ( j == 0 ) {
                    sum4 += massive[i][j];
                }
                if ( j == 1 ) {
                    sum5 += massive[i][j];
                }
                if ( j == 2 ) {
                    sum6 += massive[i][j];
                }
                if (i + j == a - 1) {
                    sum7 += massive[i][j];
                }
                if (i == j) {
                    sum8 += massive[i][j];
                }

            }
        }


        if (sum1 == nFirst || sum2 == nFirst || sum3 == nFirst || sum4 == nFirst || sum5 == nFirst || sum6 == nFirst || sum7 == nFirst || sum8 == nFirst) {
            System.out.println("Первый игрок выиграл");
            System.exit(0);
        }
        if (sum1 == nSecond || sum2 == nSecond || sum3 == nSecond || sum4 == nSecond || sum5 == nSecond || sum6 == nSecond || sum7 == nSecond || sum8 == nSecond) {
            System.out.println("Второй игрок выиграл");
            System.exit(0);
        }

        // 4-ый Ход игрока номер 2
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println();

        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (massive[a - 1][b - 1] != 0) {
            System.out.println("Данная ячейка занята. Введите новые координаты: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }

        }

        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = secondPlayer;
        }



        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

        // Проверка выигрыша
        // Проверка выигрыша
        for ( int i = 0; i < massive.length;i++)  {
            for ( int j = 0; j < massive.length; j++) {
                if (i == 0) {
                    sum1 += massive[i][j];
                }
                if ( i == 1) {
                    sum2 += massive[i][j];
                }
                if ( i == 2) {
                    sum3 += massive[i][j];
                }
                if ( j == 0 ) {
                    sum4 += massive[i][j];
                }
                if ( j == 1 ) {
                    sum5 += massive[i][j];
                }
                if ( j == 2 ) {
                    sum6 += massive[i][j];
                }
                if (i + j == a - 1) {
                    sum7 += massive[i][j];
                }
                if (i == j) {
                    sum8 += massive[i][j];
                }

            }
        }


        if (sum1 == nFirst || sum2 == nFirst || sum3 == nFirst || sum4 == nFirst || sum5 == nFirst || sum6 == nFirst || sum7 == nFirst || sum8 == nFirst) {
            System.out.println("Первый игрок выиграл");
            System.exit(0);
        }
        if (sum1 == nSecond || sum2 == nSecond || sum3 == nSecond || sum4 == nSecond || sum5 == nSecond || sum6 == nSecond || sum7 == nSecond || sum8 == nSecond) {
            System.out.println("Второй игрок выиграл");
            System.exit(0);
        }

        System.out.println("Ничья");
    }
}
