package codealphaproject;

import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<Stock, Integer> holdings;
    private double cashBalance;

    public Portfolio(double initialCash) {
        holdings = new HashMap<>();
        cashBalance = initialCash;
    }

    public void buyStock(Stock stock, int quantity) {
        double cost = stock.getCurrentPrice() * quantity;
        if (cost > cashBalance) {
            System.out.println("Insufficient funds to buy " + quantity + " shares of " + stock.getTickerSymbol());
            return;
        }
        cashBalance -= cost;
        holdings.put(stock, holdings.getOrDefault(stock, 0) + quantity);
        System.out.println("Bought " + quantity + " shares of " + stock.getTickerSymbol());
    }

    public void sellStock(Stock stock, int quantity) {
        int ownedQuantity = holdings.getOrDefault(stock, 0);
        if (quantity > ownedQuantity) {
            System.out.println("Insufficient shares to sell " + quantity + " shares of " + stock.getTickerSymbol());
            return;
        }
        cashBalance += stock.getCurrentPrice() * quantity;
        holdings.put(stock, ownedQuantity - quantity);
        System.out.println("Sold " + quantity + " shares of " + stock.getTickerSymbol());
    }

    public double getPortfolioValue() {
        double totalValue = cashBalance;
        for (Map.Entry<Stock, Integer> entry : holdings.entrySet()) {
            totalValue += entry.getKey().getCurrentPrice() * entry.getValue();
        }
        return totalValue;
    }

    public double getCashBalance() {
        return cashBalance;
    }
}
