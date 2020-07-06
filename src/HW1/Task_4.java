package HW1;

public class Task_4 {
    public static void main (String [] args) {
        int a = -1;
        int b = -1;
        int c = -10;
        int firstVariable = 0;
        int secondVariable = 0;
        int thirdVariable = 0;
        int sum = 0;

        if ( a >= 0 ) {
            firstVariable++;
        }

        if ( b >= 0 ) {
            secondVariable++;
        }

        if ( c >= 0 ) {
            thirdVariable++;
        }

        sum = firstVariable + secondVariable + thirdVariable;
        System.out.print("Кол-во положительных чисел равно " + sum);

    }
}
