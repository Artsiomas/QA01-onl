package HW1;

public class Task_2 {
    public static void main (String [] args) {
        int a = 7;
        int b = 6;
        int c = 1;
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println ("Такого треугольника не существует");
        }

    }
}
