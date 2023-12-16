package n3DependencyInjection;

public class Phone implements Article{

    private Currency currency;
    private String name;

    private float price;

    public Phone(String name, Currency currency, float price)
    {
        this.currency = currency;
        this.price = price;
        this.name = name;
    }
    @Override
    public float getPrice() throws NoSuchFieldException, NoSuchMethodException {

       return price;

    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;

    }

    @Override
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", price: " + price + currency.returnSymbol();
    }


}
