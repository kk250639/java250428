package ch18.lecture.p03writer;

import java.io.*;

public class App01 {
    public static void main(String[] args) throws IOException {
        try (OutputStream os = new FileOutputStream("C:/Temp/writer01.txt")) {
            os.write(97);
            os.write(100);
            os.write(103);
            os.write(33);

            os.write('t');  // good
            os.write('걸');
            os.flush();
        }
    }
}
