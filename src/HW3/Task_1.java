package HW3;

public class Task_1 {
    public static void main(String[] args) {
        int [] massive = new int[10];
        int a = 0;
        int b = 2;
        while (a < massive.length) {
            massive[a] = b;
            b +=2;
            a++;
        }
        for (a = 0; a < massive.length; a++) {
            System.out.print(massive[a] + " ");
        }
        System.out.println();
        for (a = 0; a < massive.length; a++) {
            System.out.println(massive[a]);

        }
    }
}
