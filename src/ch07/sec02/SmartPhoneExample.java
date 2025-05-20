package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone("갤럭시", "은색");

        System.out.println("phone.model = " + phone.model);
        System.out.println("phone.color = " + phone.color);

        System.out.println("phone.wifi = " + phone.wifi);

        phone.bell();
        phone.sendVoice("hi");
        phone.receiveVoice("hello i'm gildong");
        phone.sendVoice("meet you");
        phone.hangUp();

        phone.setWifi(true);
        phone.internet();
    }
}
