package ch09.sec06.exam02;

public class Button {
    public static interface ClickLisener {
        void onClick();
    }
    private ClickLisener clickListener;

    public void setClickListener(ClickLisener clickListener) {
        this.clickListener = clickListener;
    }
}
