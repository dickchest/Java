package ExtraLessons.HTTPServerJava;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        // создаем новые хттп сервер
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // добавляем контекст
        server.createContext("/test", new MyHandler());

        // запускаем
        server.start();
    }

    // ПРИМЕР ОБРАБОТЧИКА
    static class MyHandler implements HttpHandler {
        /*
        вызов обработчика при совпадении контекста, к которому он привязан
         */
        @Override
        public void handle(HttpExchange t) throws IOException {
            // тестовая строка
            final String response = "Это текст";

            // устанавливаем код 200 = ОК и размер отправляемых данных
            t.sendResponseHeaders(200, response.length());

            // пишем в поток вывода данные, которые отправятся пользователю
            try (OutputStream os = t.getResponseBody();){
                os.write(response.getBytes(StandardCharsets.UTF_8));
                os.flush();
            }
        }
    }
}
