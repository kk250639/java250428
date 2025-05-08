package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.powerOn();


        int result1 = c.plus(5, 6);
        System.out.println("result1 = " + result1);

        int x = 10;
        int y = 4;
        double result2 = c.divide(x, y);
        System.out.println("result2 = " + result2);

        c.powerOff();
    }
}
