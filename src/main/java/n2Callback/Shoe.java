package n2Callback;

public class Shoe {

    private static int quantity;
    private final int ID;
    private String brand;
    private int size;
    private String colour;
    private float price;

    public Shoe(String brand, int size, String colour, float price)
    {
        quantity++;
        ID = quantity;
        this.brand = brand;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return ID + ", " + brand + ", " + colour + ", " + size + ", " + price + "€";
    }
}
