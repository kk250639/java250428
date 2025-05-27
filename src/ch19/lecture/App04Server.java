package ch19.lecture;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class App04Server {
    public static void main(String[] args) throws Exception {

        try {
            ServerSocket serverSocket = new ServerSocket(9876);

            for (int i = 0; i < 100; i++) {
                Socket socket = serverSocket.accept();
                String client = socket.getRemoteSocketAddress().toString();

                Thread thread = new Thread(() -> {
                    try (InputStream is = socket.getInputStream();
                         InputStreamReader isr = new InputStreamReader(is);
                         BufferedReader br = new BufferedReader(isr);) {

                        String message = null;
                        while ((message = br.readLine()) != null) {
                            System.out.println(message);
                        }


                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            socket.close();
                        } catch (IOException e) {

                        }
                    }
                });
                thread.start();
            }

        } catch (
                Exception e) {
            e.printStackTrace();
        }


    }
}
