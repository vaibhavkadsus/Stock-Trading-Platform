# Stock-Trading-Platform

Stock Trading Platform
Objective:
The Stock Trading Platform is a simulated environment that allows users to experience basic stock trading functionalities. The program provides features such as viewing market data, buying and selling stocks, and tracking the performance of a portfolio.

Key Features:

Market Data:

The program initializes with a set of predefined stocks (e.g., AAPL, GOOGL, AMZN, MSFT) along with their current prices.
The prices are stored in a HashMap, where the key is the stock symbol, and the value is a Stock object containing the symbol and price.
Portfolio Management:

Users are given an initial balance (e.g., $10,000) in their portfolio, which is managed using a Portfolio class.
The portfolio tracks stocks owned by the user, including the quantity of each stock and the remaining cash balance.
The portfolio is capable of storing, updating, and displaying the user's stock holdings.
Buying Stocks:

Users can purchase stocks by entering the stock symbol and the quantity they wish to buy.
The program checks if the user has enough balance to cover the cost of the purchase.
If the purchase is successful, the stocks are added to the portfolio, and the purchase amount is deducted from the balance.
Selling Stocks:

Users can sell stocks they own by specifying the stock symbol and quantity to sell.
The program checks if the user has enough shares to sell.
Upon selling, the corresponding number of shares is removed from the portfolio, and the sale proceeds are added to the balance.
Portfolio Display:

Users can view their portfolio at any time, which displays the stocks they own, the quantity of each stock, the current price, and their remaining balance.
The portfolio provides a quick overview of the user's investments and available cash.
User Interaction:

The program runs in a loop, offering users a menu of options: view market data, buy stocks, sell stocks, view portfolio, or exit.
The menu-driven interface allows users to interact with the platform in a straightforward and intuitive manner.
