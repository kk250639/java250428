package aa00;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class App01computer2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.86", 9876);

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String message = br.readLine();
        System.out.println("message = " + message);
    }
}
