package etc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("C:/Temp/bear.jpg");
        FileOutputStream out = new FileOutputStream("C:/Temp/copy.jpg");

        int data;
        while ((data = in.read()) != -1) {
            out.write(data);
        }

        in.close();
        out.close();
        System.out.println("이미지 복사가 완료되었습니다.");
    }
}
