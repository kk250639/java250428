package ch06.sec10.exam03;

public class Car {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    static void simulate() {
        Car c = new Car();
        c.speed = 200;
        c.run();
    }

    public static void main(String[] args) {
        simulate();
        Car c = new Car();
        c.speed = 60;
        c.run();
    }
}
