import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class Ex1 {
    public static void main(String[] args) throws InterruptedException, IOException {
        HttpClient client = HttpClient.newHttpClient();
        URI dadjoke = URI.create("https://icanhazdadjoke.com");
        HttpRequest request = HttpRequest.newBuilder(dadjoke)
                                         .header("Accept", "text/plain")
                                         .header("User-Agent", "Yrgo OOP Java")
                                         .build();

        for (int i = 0; i < 5; i++) {
            HttpResponse<String> res = client.send(request, BodyHandlers.ofString());
            System.out.println(res.body());
        }

        // HttpClient client = HttpClient.newHttpClient();

        // URI wiki = URI.create("https://www.wikipedia.org");
        // HttpRequest request = HttpRequest.newBuilder().uri(wiki).build();

        // try {
        // HttpResponse<String> resp = client.send(request, BodyHandlers.ofString());

        // // We find the actual web page in the body
        // System.out.println(resp.body());
        // } catch (IOException ex) {
        // ex.printStackTrace();
        // }
        // catch (InterruptedException ex) {
        // System.err.println(ex.getMessage());
        // }

    }
}