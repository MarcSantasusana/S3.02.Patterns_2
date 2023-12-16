package n2Callback;

import java.util.ArrayList;
import java.util.List;

public class ShoeShop {
    private List<Shoe> shoeList;
    private PaymentGateway paymentGateway;
    private List<Payment> paymentList;


    public ShoeShop()
    {
        paymentGateway = new PaymentGateway();
        shoeList = new ArrayList<>();
        paymentList = new ArrayList<>();
    }

    public void addPayment(Payment payment)
    {
        paymentList.add(payment);

    }

    public void showPayments()
    {
        paymentList.forEach(System.out::println);
    }

    public void addShoe(Shoe shoe)
    {
        shoeList.add(shoe);
    }

    public void showShoes()
    {
        shoeList.forEach(System.out::println);

    }

    public List<Shoe> getShoeList()
    {
        return shoeList;
    }

    public void buy()
    {
        paymentList.forEach(payment -> paymentGateway.pay(payment));
    }






}
