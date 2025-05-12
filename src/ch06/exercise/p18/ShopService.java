package ch06.exercise.p18;

public class ShopService {
    private static ShopService shopservice = new ShopService();

    public static ShopService getInstance(){
        return shopservice;
    }
}
