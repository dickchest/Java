package ExtraLessons.HTTPServerJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class HttpServer {

    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server started");

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), StandardCharsets.UTF_8));

                PrintWriter writer = new PrintWriter(socket.getOutputStream());

                while (!reader.ready()) ;

                while (reader.ready()) {
                    System.out.println(reader.readLine());
                }
                writer.println("HTTP/1.1.200 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println("<h1>Привет от сервера!</h1>");
                writer.flush();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
