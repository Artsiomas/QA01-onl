package HW5;

public class Car {
    private String model;
    private int speed;
    private int price;

    public Car(String x, int y, int z){
        model = x;
        speed = y;
        price = z;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void description() {
        System.out.println(model + " ");
    }

 /*
    void start() {
        System.out.println(model + " [предстартовая проверка]");
        startEngine();
        System.out.println(model + "Автомобиль завелся ");
    }

    void stop() {
        System.out.println(model + " заглушен");

    }
    void startEngine () {
        System.out.println("Запуск двигателя");
    }
*/
    }

