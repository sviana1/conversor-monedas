
import org.json.JSONObject;

public class CurrencyConverter {

    public static double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        String json = ExchangeRateApi.getExchangeRate(fromCurrency);
        JSONObject jsonObject = new JSONObject(json);
        double rate = jsonObject.getJSONObject("rates").getDouble(toCurrency);
        return amount * rate;
    }
}
