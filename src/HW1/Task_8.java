package HW1;

public class Task_8 {
    public static void main (String [] args) {
        int a = 15;
        int b = 2;

        int sumAdd = 0;
        int sumComposition = 1;

        while (a <= 150) {
            if (a % 2 == 0) {
                sumAdd += a;
            }
            a++;
        }

        while (b <= 7) {
            sumComposition *= b;
            b++;
        }

        if (sumAdd > sumComposition) {
            System.out.println("Сумма четных чисел (от 15 до 150) равно " + sumAdd + " и это больше, чем произведение чисел (от 2 до 7), которое равно " + sumComposition);
        } else {
            System.out.println("Произведение чисел (от 2 до 7) равно " + sumComposition + " и это больше, чем сумма чисел (от 15 до 150), которое равно " + sumAdd);
        }




        // Разработать программу которая определит что больше (и выведет в консоль)сумма четных чисел от 15 до 150 или произведение чисел от 2 до 7
    }
}
