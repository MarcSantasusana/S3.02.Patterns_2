package n2Callback;
public class Paypal implements Payment {

    private Shoe shoe;

    public Paypal(Shoe shoe)
    {
        this.shoe = shoe;
    }
    @Override
    public void call() {
        System.out.println("Payment done with Paypal has been successful");;
    }

    @Override
    public String toString()
    {
        return shoe.toString();
    }
}
