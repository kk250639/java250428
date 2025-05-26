package ch18.exercise.p10;

import java.io.*;

public class Example {
    public static void main(String[] args) throws IOException {
        String origin = "images/eagle.jpg";
        String target = "C:/Temp/eagle.jpg";

        InputStream is = new FileInputStream(origin);
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream os = new FileOutputStream(target);
        BufferedOutputStream bos = new BufferedOutputStream(os);

        // 파일 복사 코드 작성
        // BufferedInputStream, BufferedOutputStream 활용
        try (bis; bos;) {
            byte[] bucket = new byte[1000];
            int length = 0;
            while ((length = is.read(bucket)) != -1) {
                os.write(bucket, 0, length);
            }
            bos.flush();
        }
    }
}
