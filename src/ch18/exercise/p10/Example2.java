package ch18.exercise.p10;

import java.io.*;

public class Example2 {
    public static void main(String[] args) throws IOException {

        String d2 = "C:/Temp/dir2";
        File f2 = new File(d2);
        System.out.println(f2.exists());

        if (!f2.exists()) {
            f2.mkdir();    // 부모 디렉토리까지 모두 만들기
        }

        String o1 = "C:/Temp/cr1/bear.jpg";
        String t1 = "C:/Temp/dir2/bear.jpg";

        InputStream is = new FileInputStream(o1);
        BufferedInputStream bis = new BufferedInputStream(is);
        OutputStream os = new FileOutputStream(t1);
        BufferedOutputStream bos = new BufferedOutputStream(os);
        try (bis; bos) {
            byte[] bucket = new byte[1000];
            int length = 0;
            while ((length = is.read(bucket)) != -1) {
                os.write(bucket, 0, length);
            }

            os.flush();
        }
        System.out.println("파일 복사 종료");
    }
}
