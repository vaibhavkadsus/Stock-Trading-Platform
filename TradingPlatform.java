package codealphaproject;

import java.util.Scanner;

public class TradingPlatform {
    private Market market;
    private Portfolio portfolio;

    public TradingPlatform() {
        market = new Market();
        portfolio = new Portfolio(10000.00); // Starting with $10,000
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. View Market Prices\n2. Buy Stock\n3. Sell Stock\n4. View Portfolio\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewMarketPrices();
                    break;
                case 2:
                    buyStock(scanner);
                    break;
                case 3:
                    sellStock(scanner);
                    break;
                case 4:
                    viewPortfolio();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

            market.updateMarketPrices(); // Simulate market price change after each action
        }
    }

    private void viewMarketPrices() {
        System.out.println("\nMarket Prices:");
        for (String ticker : market.getStock().keySet()) {
            Stock stock = market.getStock(ticker);
            System.out.println(stock.getTickerSymbol() + ": $" + stock.getCurrentPrice());
        }
    }

    private void buyStock(Scanner scanner) {
        System.out.print("Enter the ticker symbol of the stock you want to buy: ");
        String tickerSymbol = scanner.nextLine();
        Stock stock = market.getStock(tickerSymbol);
        if (stock == null) {
            System.out.println("Stock not found.");
            return;
        }
        System.out.print("Enter the number of shares to buy: ");
        int quantity = scanner.nextInt();
        portfolio.buyStock(stock, quantity);
    }

    private void sellStock(Scanner scanner) {
        System.out.print("Enter the ticker symbol of the stock you want to sell: ");
        String tickerSymbol = scanner.nextLine();
        Stock stock = market.getStock(tickerSymbol);
        if (stock == null) {
            System.out.println("Stock not found.");
            return;
        }
        System.out.print("Enter the number of shares to sell: ");
        int quantity = scanner.nextInt();
        portfolio.sellStock(stock, quantity);
    }

    private void viewPortfolio() {
        System.out.println("\nPortfolio Value: $" + portfolio.getPortfolioValue());
        System.out.println("Cash Balance: $" + portfolio.getCashBalance());
    }

    public static void main(String[] args) {
        TradingPlatform platform = new TradingPlatform();
        platform.start();
    }
}

