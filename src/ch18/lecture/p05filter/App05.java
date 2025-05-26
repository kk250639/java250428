package ch18.lecture.p05filter;

import java.io.*;

public class App05 {
    public static void main(String[] args) {
        String file = "C:/Temp/filter05.txt";

        // OutputStream를 writer로 감싸는 보조스트림(filter stream)
        // OutpusStreamWriter
        try (OutputStream os = getOutputStream(file);
             Writer osw = new OutputStreamWriter(os)) {
            osw.write('a');
            osw.write('b');
            osw.write('x');
            osw.write('y');
            osw.write('한');
            osw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    private static OutputStream getOutputStream(String file) throws IOException {
        return new FileOutputStream(file);
    }
}
