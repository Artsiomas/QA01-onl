package HW3;

import java.util.Arrays;
import java.util.Random;

public class Task_8 {
    public static void main(String [] args) {
        Random random = new Random();

        int firstMassive[] = new int[10];
        for (int i = 0; i < firstMassive.length; i++) {
            firstMassive[i] = random.nextInt(9);
        }

        int secondMassive [] = new int[10];
        for (int i = 0; i < secondMassive.length; i++) {
            secondMassive[i] = random.nextInt(9);
        }

        int index = 0;
        double thirdMassive [] = new double[10];
        for (int i = 0; i < thirdMassive.length; i++) {
            thirdMassive[index] = (double) firstMassive[i]/secondMassive[i];
            index++;
        }
        System.out.println(Arrays.toString(firstMassive));
        System.out.println(Arrays.toString(secondMassive));
        System.out.println(Arrays.toString(thirdMassive));
    }
}
