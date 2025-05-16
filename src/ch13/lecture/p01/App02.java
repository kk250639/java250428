package ch13.lecture.p01;

public class App02 {
    public static void main(String[] args) {
        Box02 b = new Box02();
        b.setItem(3.14);
        Number item = b.getItem();
        System.out.println(" = " +item);
    }
}


class Box02 {
    private Number item;

    public Number getItem() {
        return item;
    }

    public void setItem(Number item) {
        this.item = item;
    }
}