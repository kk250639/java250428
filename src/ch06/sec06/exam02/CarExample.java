package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        Car c = new Car();

        System.out.println("c.company = " + c.company);
        System.out.println("c.model = " + c.model);
        System.out.println("c.color = " + c.color);
        System.out.println("c.maxSpeed = " + c.maxSpeed);
        System.out.println("c.speed = " + c.speed);

        c.speed = 60;
        c.color = "노랑";
        System.out.println("c.speed = " + c.speed);
        System.out.println("c.color = " + c.color);
    }
}
