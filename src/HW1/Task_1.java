package HW1;

public class Task_1 {
    public static void main (String[] args) {
        int a =126;
        if (a >= 0 && a < 10) {
            System.out.print ("В данном числе 1 цифра");
            if (a % 2 == 0) {
                System.out.print(" и оно четное");
            } else {
                System.out.print(" и оно нечетное");
            }
        }

        if (a >= 10 && a < 100) {
            System.out.print ("В данном числе 2 цифры");
            if (a % 2 == 0) {
                System.out.print(" и оно четное");
            } else {
                System.out.print(" и оно нечетное");
            }
        }

        if (a >= 100 && a < 1000) {
            System.out.print ("В данном числе 3 цифры");
            if (a % 2 == 0) {
                System.out.print(" и оно четное");
            } else {
                System.out.print(" и оно нечетное");
            }
        }

        if (a >= 1000 && a < 10000) {
            System.out.print ("В данном числе 4 цифры");
            if (a % 2 == 0) {
                System.out.print(" и оно четное");
            } else {
                System.out.print(" и оно нечетное");
            }
        }
    }
}
