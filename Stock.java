package codealphaproject;

public class Stock {
    private String tickerSymbol;
    private double currentPrice;

    public Stock(String tickerSymbol, double currentPrice) {
        this.tickerSymbol = tickerSymbol;
        this.currentPrice = currentPrice;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}

