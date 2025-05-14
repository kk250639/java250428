package ch08.sec06;

public interface RemoteControl {
    // 상수 필드
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    // 추상 메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    public default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음 처리");
            setVolume(MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
        }
    }

    public static void changeBattery() {

        System.out.println("리모콘 건전지를 교환합니다.");
    }
}
