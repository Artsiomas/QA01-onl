package HW2;

public class Task_1 {
    public static void main ( String[] args ) {
        double sum = 0;
        double percent = 1.1;
        double oneDay = 10;

        for (int days = 1; days <= 7; days++) {
            if (days > 1) {
                oneDay *= percent;
            }
            sum += oneDay;
        }
        System.out.print("кол-во км, которые пробежал спортсмен, равно " + sum);
    }
}
