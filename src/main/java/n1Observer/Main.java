package n1Observer;

public class Main {

    public static void main(String[] args)
    {
        StockBroker stockBroker = new StockBroker();

        stockBroker.addAgency(new StockAgency());
        stockBroker.addAgency(new StockAgency());
        stockBroker.addAgency(new StockAgency());

        brokerSetsStock(stockBroker, 0.05f);

        brokerSetsStock(stockBroker, 0.1f);

        brokerSetsStock(stockBroker, 0.07f);

    }

    public static void brokerSetsStock(StockBroker stockBroker, float stock)
    {
        stockBroker.setStock(stock);

        System.out.println("Broker sets stock to " + stockBroker.getStock());
        stockBroker.getAgencyList().forEach(System.out::println);
        System.out.println();

    }
}
