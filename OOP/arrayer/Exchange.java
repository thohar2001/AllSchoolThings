import java.util.List;

public class Exchange {
    private String currency;
    private double exchangeRateToEuro;

    public Exchange(String currency, double exchangeRate) {
        this.currency = currency;
        this.exchangeRateToEuro = exchangeRate;
    }
    public double convertToEuro(double currency) {
        return currency * exchangeRateToEuro;
    }

    public double convertFromEuro(double euro) {
        return euro / exchangeRateToEuro;
    }

    public String getCurrency() {
        return this.currency;
    }
    
    public double getExchangeRateToEuro () {
        return this.exchangeRateToEuro;
    }
}
