package ch11.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static java.lang.Class.forName;

public class App15 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
        method1();
    }
    // throws로 여러 exception 발생한다고 명시 할 수 있음
    public static void method1() throws FileNotFoundException, ClassNotFoundException{

//        FileNotFoundException
        FileInputStream fio = new FileInputStream("");
//        ClassNotFoundException
        Class.forName("");
    }
}
