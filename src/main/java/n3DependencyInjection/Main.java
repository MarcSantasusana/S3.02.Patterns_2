package n3DependencyInjection;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {

        List<Article> articleList = new ArrayList<>();

        int option;
        boolean quit = false;

        while(!quit) {

            option = askInt("Menu: \n" +
                    "0. Quit \n" +
                    "1. Add product  \n" +
                    "2. Change currency \n" +
                    "3. Show prices \n");


            switch (option) {

                case 0:

                    quit = true;
                    break;

                case 1:

                    addProduct(articleList);

                    break;

                case 2:
                    changeCurrency(articleList);

                    break;

                case 3:

                    showPrices(articleList);

                    break;

                default:


            }

        }


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

    public static float askFloat(String message)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(message);

        float input = scanner.nextFloat();

        return input;
    }

    public static void addProduct(List<Article> articleList)
    {
        Article article = null;
        Currency currency = null;

       String name = askString("Introduce the product name");
       String type = askString("Introduce the product type (Computer, phone, television)").toUpperCase();
       String currencyString = askString("Introduce the product currency (EUR, GBP, USD)").toUpperCase();
       float price = askFloat("Introduce the product price");

       switch(currencyString)
       {
           case "EUR":

               currency = new EUR();

               break;

           case "GBP":

               currency = new GBP();

               break;

           case "USD":

               currency = new USD();

               break;

           default:
       }

       switch(type)
       {
           case "COMPUTER":

               article = new Computer(name, currency, price);

               break;

           case "PHONE":

               article = new Phone(name, currency, price);

               break;

           case "TELEVISION":

               article = new Television(name, currency, price);

               break;

           default:
       }
        articleList.add(article);
    }

    public static void changeCurrency(List<Article> articleList) throws NoSuchFieldException, NoSuchMethodException {
        String name = askString("Introduce the name of the product you want to change its currency");

        Article article = findProduct(name, articleList);

        CurrencyChanger currencyChanger = null;

        String currencyString = askString("Introduce the new currency (EUR, GBP, USD)").toUpperCase();

        switch(currencyString)
        {
            case "EUR":

                currencyChanger = new CurrencyChanger(article, new EUR());

                break;

            case "GBP":

                currencyChanger = new CurrencyChanger(article, new GBP());

                break;

            case "USD":

                currencyChanger = new CurrencyChanger(article, new USD());

                break;

            default:
        }

        currencyChanger.changePrice();


    }

    public static void showPrices(List<Article> articleList)
    {
        articleList.forEach(System.out::println);
    }

    public static Article findProduct(String name,List<Article> articleList)
    {
        Optional<Article> product = articleList.stream()
                .filter(article -> article.getName().equals(name))
                .findFirst();

        return product.get();
    }
}
