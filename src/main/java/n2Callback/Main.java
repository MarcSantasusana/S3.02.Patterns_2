package n2Callback;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        ShoeShop shoeShop = new ShoeShop();

        initializeShoes(shoeShop);

        chooseShoes(shoeShop);

        confirmPurchase(shoeShop);

    }

    public static int askInt(String message)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        int input = scanner.nextInt();

        return input;

    }

    public static String askString(String message)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        String input = scanner.nextLine();

        return input;

    }

    public static void initializeShoes(ShoeShop shoeShop)
    {
        shoeShop.addShoe(new Shoe("Vans", 23, "Black", 34));
        shoeShop.addShoe(new Shoe("Nike", 43, "Red", 54));
        shoeShop.addShoe(new Shoe("Reebok", 36, "White", 43));
        shoeShop.addShoe(new Shoe("Vans", 45, "Green", 78));
        shoeShop.addShoe(new Shoe("Nike", 34, "Purple", 67));
        shoeShop.addShoe(new Shoe("Reebok", 29, "Pink", 54));

    }

    public static void chooseShoes(ShoeShop shoeShop)
    {

        System.out.println("This is the list of all the shoes available to buy \n");

            shoeShop.showShoes();

            int chosenShoe = askInt("\nIntroduce the id of the shoes you want to buy");


            Shoe shoe = shoeShop.getShoeList().get(chosenShoe - 1);

        String paymentMethod = askString("What method do you want to buy with (CreditCard, Paypal" +
                ", BankAccount)").toUpperCase();

        Payment payment = null;

                switch (paymentMethod) {
                    case "CREDITCARD":

                        payment = new CreditCard(shoe);

                        break;

                    case "PAYPAL":

                        payment = new Paypal(shoe);

                        break;


                    case "BANKACCOUNT":

                        payment = new BankAccount(shoe);

                        break;
                }

                shoeShop.addPayment(payment);

    }

    public static void confirmPurchase(ShoeShop shoeShop)
    {

        shoeShop.showPayments();

        String confirmString = askString("Do you confirm your purchase? (Yes/No)").toUpperCase();

        if(confirmString.equals("YES"))
        {
           shoeShop.buy();

        }


    }
}
