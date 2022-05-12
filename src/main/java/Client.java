import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        String host = "localhost";
        int port = 8086;

        try (Socket socket = new Socket(host, port);
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

            out.println("netology.ru");
            String resp = in.readLine();
            System.out.println( resp);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

