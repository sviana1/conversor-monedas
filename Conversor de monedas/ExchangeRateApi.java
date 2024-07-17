import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExchangeRateApi {

    private static final String API_KEY = "b0b7ea1e0443a7aebf1e111d"; // Reemplaza con tu API Key de ExchangeRate API
    private static final String BASE_URL = "https://api.exchangerate-api.com/v4/latest/";

    public static String getExchangeRate(String fromCurrency) throws Exception {
        String urlString = BASE_URL + fromCurrency;
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + API_KEY);

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        return content.toString();
    }
}