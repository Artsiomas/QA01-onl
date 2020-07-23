package HW6;

public class Task_1 {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        computer1.setProcessor("Intel i5");
        computer1.setHdd(512);
        computer1.setMemory(16);
        computer1.setResource(5);

        computer1.description();
        System.out.println("=========");
        computer1.turnOn();
        computer1.turnOff();
        computer1.turnOn();
        computer1.turnOff();
    }
}
