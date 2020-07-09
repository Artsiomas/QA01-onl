package HW1;

public class Task_2 {
    public static void main (String [] args) {
        int a = 1;
        int b = 3;
        int c = 99;
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println ("Такого треугольника не существует");
        }

    }
}
