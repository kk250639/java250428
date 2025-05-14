package ch16.excercise.p05;

public class Example {
    public static void main(String[] args) {
        Button btnOk = new Button();
        btnOk.setClickListener(() -> System.out.println("ok 버튼 클릭"));
        btnOk.click();

        Button c = new Button();
        c.setClickListener(() -> System.out.println("취소 버튼 클릭"));
        c.click();
    }
}
