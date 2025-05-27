package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App01Computer {
    public static void main(String[] args) throws IOException {
        // 1번 컴퓨터와 2번 컴퓨터를 연결하기
        // 1번 컴퓨터(server)
        // : 연결 기다림
        ServerSocket serverSocket = new ServerSocket(9876);
        Socket socket = serverSocket.accept();

        try (socket; serverSocket) {
            // 1번 컴퓨터에서
            // 2번 컴퓨터로
            // "hello" 메세지를 보내기

            // getOutputStream : 어떤 대상에 데이터를 출력(보냄)할 수 있도록 도와주는 범용적 메소드
            OutputStream os = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);
            try (bw; osw; os) {
                bw.write("hello");
                bw.flush();
            }
        }
    }
}

//192.168.0.5
//192.168.0.86