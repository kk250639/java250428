package etc;

import java.io.*;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Temp/input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:/Temp/output.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }


        br.close();
        bw.close();
        System.out.println("줄 단위 텍스트 복사가 완료되었습니다.");

    }
}
