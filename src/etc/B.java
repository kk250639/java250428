package etc;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("C:/Temp/input.txt");
        FileWriter writer = new FileWriter("C:/Temp/output.txt");

        int data;
        while ((data = reader.read()) != -1) {
            writer.write(data);
        }

        reader.close();
        writer.close();
        System.out.println("텍스트 복사가 완료되었습니다.");

    }
}
