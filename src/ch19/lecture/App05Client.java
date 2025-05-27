package ch19.lecture;

import java.io.*;
import java.net.Socket;

public class App05Client {
    public static void main(String[] args) {
        String serverIp = "192.168.0.5"; // 서버 IP 주소
        int serverPort = 9876;
        String filePath = "C:/javaweb/client/html/바탕화면1.jpg"; // 전송할 파일 경로

        try (
                Socket socket = new Socket(serverIp, serverPort);
                FileInputStream fis = new FileInputStream(filePath);
                BufferedInputStream bis = new BufferedInputStream(fis);
                OutputStream os = socket.getOutputStream();
                BufferedOutputStream bos = new BufferedOutputStream(os);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            bos.flush(); // 중요: 전송 완료 신호
            System.out.println("파일 전송 완료");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}