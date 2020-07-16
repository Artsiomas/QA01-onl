package HW3;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int count = 0;
        int a = 1;
        while (a <= 99) {
            a += 2;
            count++;
        }

        int b = 1;
        int[] massive = new int[count];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = b;
            b += 2;
        }
        System.out.println(Arrays.toString(massive));


        for (int i = massive.length - 1; i >= 0; i-- ) {

            System.out.print(massive[i] + " ");
        }
    }
}
