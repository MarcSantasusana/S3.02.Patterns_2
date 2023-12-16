package n1Observer;

public class StockAgency implements Agency{

    private float stock;
    private static int quantity;
    private final int id;

    public StockAgency()
    {
        quantity++;
        id = quantity;
    }

    @Override
    public void update(float stock) {

        this.stock = stock;
    }



    @Override
    public String toString()
    {
        return "StockAgency" + id + ": " + stock;
    }
}
