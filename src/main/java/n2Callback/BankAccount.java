package n2Callback;

public class BankAccount implements Payment{

    private Shoe shoe;

    public BankAccount(Shoe shoe)
    {
        this.shoe = shoe;
    }
    @Override
    public void call() {
        System.out.println("Payment done with BankAccount has been successful");
    }

    @Override
    public String toString()
    {
        return shoe.toString();
    }
}
