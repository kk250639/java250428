package ch13.lecture.p01;

public class App1 {
    public static void main(String[] args) {
        Box01 box = new Box01();
//        box.setItem(99);
//        Integer v = box.getItem();
//        System.out.println("v = " + v);

        box.setItem(3.14);  //
    }
}
class Box01 {
    private Double item;
    public Double getItem() {
        return item;
    }
    public void setItem(Double item) {
        this.item = item;
    }
}