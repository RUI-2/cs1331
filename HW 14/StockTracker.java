//I worked on the homework assignment alone, using only course materials.
/**
    Question 1:
        *Pro of Inner Class:-Inner class instances are reusable, so it's more efficient if it's used multiple times.
        *Con of Inner Class:-It's cumbersome to write a entire class for one instance's one-time usage.
        *Pro of Anonymous Class:-It can't be used outside of the specific instance, which makes class hierarchy clearer.
        *Con of Anonymous Class:-It's still not as efficient as Inner class to use multiple times nor is it as efficient
                                 as Lambda expression to use once.
        *Pro of Lambda Expression:-It's very concise and clean to represent method in one single line of statement
        *Con of Lambda Expression:-It can only be used with functional interface, so it can only implement one method
                                  -It's less intuitive to understand at first sight.

    Question 2: Lambda expression is allowed here because Consumer is a functional Interface is a functional interface
                that has only one abstract method. So when we are registering an event handler for the market, the
                complier recognizes currPrice parameter is of type Consumer and knows that we are overriding
                the accept() method in Consumer interface.

    Question 3: -There are lots of stocks in the market, therefore it will be inefficient to write bunch of if
                 statements to notify the stock and call designated method if there's a price change on market.
                 However, with event-driven programming, all programmer has to do is register each stock to the
                 price-changing event, then whenever there's a price change on market, the corresponding stock
                 will automatically be triggered and invoke the correct method.
                -The stocks are constantly changing prices in a random order. Event-driven programming makes
                 capturing such asynchronous behavior easy: whenever the price changes, the event is triggered,
                 which is then handled by the corresponding registered stock.
                -Each stock has three different kinds of register tracker, event-driven programming allows the
                 programs to automatically figure out which handler(method) it should use when an event is
                 triggered in the market, which saves lots of repetitive codes.
 */
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * This file contains a class StockTracker
 * @author Ruirui Ma
 * @version 1.0
 */
public class StockTracker {
    private List<Stock> trackedStocks = new ArrayList<Stock>();
    private int cutoff;
    private Market market;

    /**
     * This constructor makes a StockTracker object and register the stocks
     * @param market The market where stock's prices are updated
     * @param stocks An arraylist of stocks in the stock tracker
     * @param cutoff The cutoff to determine whether one should hold, buy or sell stock
     */
    public StockTracker(Market market, Stock[] stocks, int cutoff) {
        for (Stock temp : stocks) {
            trackedStocks.add(temp);
        }
        this.cutoff = cutoff;
        this.market = market;
        for (Stock temp2 : stocks) {
            registerHoldTracker(temp2);
            registerBuyTracker(temp2);
            registerSellTracker(temp2);
        }
    }

    /**
     * This method gets a copy of the stocks in stock tracker
     * @return The copy of the stocks
     */
    public List<Stock> getTrackedStocks() {
        ArrayList<Stock> copy = new ArrayList<Stock>();
        for (Stock temp : trackedStocks) {
            copy.add(temp);
        }
        return copy;
    }

    /**
     * This method gets the cutoff
     * @return The cutoff
     */
    public int getCutoff() {
        return cutoff;
    }


    /**
     * This method gets the market
     * @return The market
     */
    public Market getMarket() {
        return market;
    }

    /**
     * This method gets a copy of the stocks in stock tracker
     * @param stock The stock to hold
     */
    private void registerHoldTracker(Stock stock) {
        HoldTracker hold = new HoldTracker(stock);
        market.registerHandler(stock, hold);
    }
    class HoldTracker implements Consumer<Integer> {
        private Stock stock;

        /**
         * This constructor makes a HoldTracker object
         * @param stock The stock to hold
         */
        public HoldTracker(Stock stock) {
            this.stock = stock;
        }

        /**
         * This method accepts the updated price of the stock
         * @param currPrice The updated price of the stock
         */
        @Override
        public void accept(Integer currPrice) {
            if (stock.getInitialValue() < currPrice && (stock.getInitialValue() + cutoff) > currPrice) {
                System.out.println(stock.getCompanyName() + " is valued at $"
                    + currPrice + ". Hold on to what you have.");
            }
        }
    }
    private void registerBuyTracker(Stock stock) {
        market.registerHandler(stock, new Consumer<Integer>() {
            @Override
            public void accept(Integer currPrice) {
                if ((stock.getInitialValue() - cutoff) > currPrice) {
                    System.out.println(stock.getCompanyName() + " just dropped to $" + currPrice + ". Buy now!");
                }
            }
        });
    }

    private void registerSellTracker(Stock stock) {
        market.registerHandler(stock,  currPrice -> {
                if ((stock.getInitialValue() + cutoff) < currPrice) {
                    System.out.println(stock.getCompanyName()
                        + " just rosed to $" + currPrice + ". Sell now!");
                }
            });
    }
}