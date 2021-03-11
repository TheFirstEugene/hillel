package HW17_json;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class JsonMain {
    public static void main(String[] args) throws IOException {
        int a = 5;
        Socket socket = null;
        try {
            socket = new Socket("jsonplaceholder.typicode.com", 80);
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outputStream = socket.getOutputStream();
        socket.getKeepAlive();

        InputStream inputStream = socket.getInputStream();
        String s = "GET /users/"+ a + " HTTP/1.1\n" +          // число а --> айди пятого юзера
                "Host: jsonplaceholder.typicode.com\n" +
                "\n" +
                "\n";
        outputStream.write(s.getBytes());
        int id;
        outputStream.write(s.getBytes());

        while ((id = inputStream.read()) != -1) {
            System.out.print((char) id);

        }
    }
}
