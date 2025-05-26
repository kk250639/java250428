package ch18.lecture.p01output;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class App03 {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("c:/Temp/output3.data");

        os.write(300);
        os.write(new byte[]{1,2,3,4,5});
        os.write(new byte[]{2,3,4,5,6,7},2,3);  //  2번 index 부터

        System.out.println("프로그램 종료");
    }
}
