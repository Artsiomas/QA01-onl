package HW2;

public class Task_3 {
    public static void main (String[] args) {
        int sum = 0;

        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }
        System.out.print(sum);
    }
}
