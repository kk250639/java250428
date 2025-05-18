package ch12.lecture.p05Wrapper;

public class App04 {
    public static void main(String[] args) {
        Book1 b1 = new Book1();
        System.out.println("b1.getTitle() = " + b1.getTitle());
        System.out.println("b1.getPrice() = " + b1.getPrice());

        System.out.println();
        Book2 b2 = new Book2();
        System.out.println("b2.getTitle() = " + b2.getTitle());
        System.out.println("b2.getPrice() = " + b2.getPrice());
    }
}

class Book2 {
    private String title;
    private Integer price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}

class Book1 {
    private String title;
    private int price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}