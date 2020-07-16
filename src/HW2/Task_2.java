package HW2;

public class Task_2 {
    public static void main (String[] args) {
        int cell = 1;
        int del = 2;

        for (int ours = 3; ours <= 33; ours +=3 ) {
            cell *= del;
            System.out.println("Через " + ours + " часов будет " + cell + " амёб");
        }
    }
}
