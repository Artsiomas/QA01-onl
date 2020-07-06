package HW1;

public class Task_5 {
    public static void main (String [] args) {
        int a = 12;
        int b = -7;
        int c = -123;

        int firstNegativeVariable = 0;
        int secondNegativeVariable = 0;
        int thirdNegativeVariable = 0;
        int firstPositiveVariable = 0;
        int secondPositiveVariable = 0;
        int thirdPositiveVariable = 0;
        int sumPositive = 0;
        int sumNegative = 0;

        if ( a >= 0 ) {
            firstPositiveVariable++;
        } else {
            firstNegativeVariable++;
        }

        if ( b >= 0 ) {
            secondPositiveVariable++;
        } else {
            secondNegativeVariable++;
        }

        if ( c >= 0 ) {
            thirdPositiveVariable++;
        } else {
            thirdNegativeVariable++;
        }
        sumPositive = firstPositiveVariable + secondPositiveVariable + thirdPositiveVariable;
        sumNegative = firstNegativeVariable + secondNegativeVariable + thirdNegativeVariable;

        System.out.println("Кол-во положительных чисел равно " + sumPositive);
        System.out.println("Кол-во отрицательных чисел равно " + sumNegative);

    }
}
