package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class App12 {
    public static void main(String[] args) {
        try {
            FileInputStream fls = new FileInputStream("");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
