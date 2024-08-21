package codealphaproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Market {
    private Map<String, Stock> stocks;

    public Market() {
        stocks = new HashMap<>();
        // Initialize with some stocks
        stocks.put("AAPL", new Stock("AAPL", 150.00));
        stocks.put("GOOGL", new Stock("GOOGL", 2800.00));
        stocks.put("AMZN", new Stock("AMZN", 3400.00));
    }

    public Stock getStock(String tickerSymbol) {
        return stocks.get(tickerSymbol);
    }

    // Simulate market price changes
    public void updateMarketPrices() {
        Random rand = new Random();
        for (Stock stock : stocks.values()) {
            double change = rand.nextDouble() * 10 - 5; // Price change between -5 and +5
            stock.setCurrentPrice(stock.getCurrentPrice() + change);
        }
    }

	public Object getStock() {
		// TODO Auto-generated method stub
		return null;
	}
}
