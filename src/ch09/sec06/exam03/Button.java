package ch09.sec06.exam03;

public class Button {
    // 정적 멤버 인터페이스
    public static interface ClickLisener {
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickLisener clickListener;

    // 메소드
    public void setClickListener(ClickLisener clickListener) {
        this.clickListener = clickListener;
    }
    public void click() {
        this.clickListener.onClick();
    }
}
