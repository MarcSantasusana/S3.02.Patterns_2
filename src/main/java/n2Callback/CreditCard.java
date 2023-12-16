package n2Callback;

public class CreditCard implements Payment{

    private Shoe shoe;

    public CreditCard(Shoe shoe)
    {
        this.shoe = shoe;
    }
    @Override
    public void call() {
        System.out.println("Payment done with CreditCard has been successful");
    }

    @Override
    public String toString()
    {
        return shoe.toString();
    }
}
