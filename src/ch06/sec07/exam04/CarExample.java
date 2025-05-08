package ch06.sec07.exam04;

public class CarExample {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("자동차");
        Car c3 = new Car("자동차", "빨강");
        Car c4 = new Car("택시", "검정", 200);

        System.out.println("c1.company = " + c1.company);
        System.out.println("c1.model = " + c1.model); // null
        System.out.println("c1.color = " + c1.color); // null
        System.out.println("c1.maxSpeed = " + c1.maxSpeed); // 0

        System.out.println("c2.company = " + c2.company);
        System.out.println("c2.model = " + c2.model);
        System.out.println("c2.color = " + c2.color); // null
        System.out.println("c2.maxSpeed = " + c2.maxSpeed); // 0

        System.out.println("c3.company = " + c3.company);
        System.out.println("c3.model = " + c3.model); //
        System.out.println("c3.color = " + c3.color);
        System.out.println("c3.maxSpeed = " + c3.maxSpeed); // 0

        System.out.println("c4.company = " + c4.company);
        System.out.println("c4.model = " + c4.model);
        System.out.println("c4.color = " + c4.color);
        System.out.println("c4.maxSpeed = " + c4.maxSpeed);
    }
}
