package ch07.lecture.p07final;

public class App01 {
}

class Parent01 {

    public void action1() {
    }
    final public void action2(){

    }
}
class Child011 extends Parent01 {
//    @Override
//    public void action2() {
//    }
    @Override
    public void action1() {
        super.action1();
    }
}
