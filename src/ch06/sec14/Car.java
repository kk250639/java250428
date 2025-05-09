package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

    // alt insert

    // boolean type getter는 is로 시작
    public boolean isStop() {
        return stop;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop) {
            this.speed = 0;
        }
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            speed = 0;
        } else {
            this.speed = speed;
        }
    }
}
