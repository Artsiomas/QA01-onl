package HW2;

public class Task_5 {
    public static void main (String[] args) {
        double difference = 2.54;
        double cm;

        for (int inch = 1; inch <= 20; inch++) {
            cm = inch * difference;
            System.out.println(inch + " = " + cm);
        }
    }
}
