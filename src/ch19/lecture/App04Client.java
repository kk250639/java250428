package ch19.lecture;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class App04Client {
    public static void main(String[] args) throws Exception {
        try (
                Socket socket = new Socket("192.168.0.5", 9876);
        ) {
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw);

            Scanner scanner = new Scanner(System.in);

            try (pw; bw; osw; os) {
                while (true) {
                    System.out.println("입력>");
                    pw.println(scanner.nextLine());
                    pw.flush();
                }
            }
        } catch (Exception e) {

        }
    }
}
