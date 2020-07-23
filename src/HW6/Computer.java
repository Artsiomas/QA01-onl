package HW6;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String processor;
    private int memory;
    private int hdd;
    private int resource;

    boolean statusComp = false;
    int count = 0;
    boolean compTurnOn =  true;

    public Computer() {
        this.processor = processor;
        this.memory = memory;
        this.hdd = hdd;
        this.resource = resource;
    }



    public void description() {
        System.out.println(processor + " " + memory + " " + hdd + " " + resource);
    }
    public void turnOn () {
        if (statusComp == false) {
            if (resource > count) {
                if (compTurnOn == true) {

                    Random random = new Random();
                    int c = random.nextInt(10);
                    if (c < 2) {
                        Scanner scanner = new Scanner(System.in);
                        int a = random.nextInt(1);
                        System.out.println("Введите число ( 0 или 1): ");
                        int b = scanner.nextInt();
                        if (a != b) {
                            compTurnOn = false;
                        } else {
                            statusComp = true;
                        }
                    } else {
                        System.out.println("Компьютер включен");
                    }

                    count++;
                } else {
                    System.out.println("Компьютер выключен");
                }
            } else {
                burningComputer();
            }
        } else {
            statusComp = true;
            System.out.println("Компьютер сгорел");
        }
    }


    public void turnOff () {
        if (statusComp == false) {
            if (resource < count) {
                if (compTurnOn == false) {
                    Random random = new Random();
                    int c = random.nextInt(10);
                    if (c < 2) {
                        Scanner scanner = new Scanner(System.in);
                        int a = random.nextInt(1);
                        System.out.println("Введите число ( 0 или 1): ");
                        int b = scanner.nextInt();

                        if (a != b) {
                            compTurnOn = false;
                        } else {
                            statusComp = true;
                        }
                    } else {
                        System.out.println("Компьютер выключен");
                    }

                    count++;
                } else {
                    System.out.println("Компьютер  не включен");
                }
            } else {
                burningComputer();
            }
        } else {
            statusComp = true;
            System.out.println("Компьютер сгорел");
        }
    }

    void burningComputer () {
        if (resource > count/2 ) {
            System.out.println("Компьютер сгорел");
        }
    }


    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }
}
