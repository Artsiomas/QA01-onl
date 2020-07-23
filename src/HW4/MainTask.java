package HW4;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        System.out.println("Вас приветствует игра Крестики-нолики!\n Краткие правила игры:\n В игре учавствуют два игрока: Игрок 1 (1) и Игрок 2 (2). Каждый игрок делает по 1-му ходу. Игра длиться до того момента, пока кто-нибудь не победит или все клетки не будут заполнены.\n");
        Scanner scanner = new Scanner(System.in);

        // обозначение игроков
        int firstPlayer = 1;
        int secondPlayer = 2;
        int c = 1;

        // первоначальное поле, вывод
        int massive[][] = new int[3][3];
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                massive[i][j] = 0;
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Ввод координат
        System.out.println("Ход игрока номер 1.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println();


        while (c < massive.length) {
            while (a > 3 || b > 3 || a < 0 || b < 0) {
                System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
            }
            if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
                massive[a - 1][b - 1] = firstPlayer;
            } else {
                System.out.println("Данная ячейка занята");
            }


        }
        /*
        //Исключение не верно введенных координат
        while (a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        //присвоение значения
        System.out.println();
        if (massive[a - 1][b - 1] != 1 || massive[a - 1][b - 1] != 2) {
            massive[a - 1][b - 1] = firstPlayer;
        } else {
            System.out.println("Данная ячейка занята");
        }
        //просмотр матрицы с присвоенным значением
        for (int i = 0; i < massive.length; i ++){
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Ход игрока номер 2
        System.out.println("Ход игрока номер 2.\n Введите две кординаты от 1 до 3 включительно через пробел: ");
        a = scanner.nextInt();
        b = scanner.nextInt();

        while ( a > 3 || b > 3 || a < 0 || b < 0) {
            System.out.println("Вы ввели не верные координаты. Повторите ввод: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }

        System.out.println();
        if (massive[a - 1][b - 1] != firstPlayer || massive[a - 1][b - 1] != secondPlayer) {
            massive[a - 1][b - 1] = secondPlayer;
        }
        for (int i = 0; i < massive.length; i ++){
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }

*/
        }
    }
