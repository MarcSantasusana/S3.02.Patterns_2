package n3DependencyInjection;

public class CurrencyChanger {

    private Article article;
    private Currency currency;

    public CurrencyChanger(Article article, Currency currency)
    {
        this.article = article;

        this.currency = currency;
    }

    public void changePrice() throws NoSuchFieldException, NoSuchMethodException {

        currency.convertPrice(article);
        article.setCurrency(currency);
    }

    public void changeToCurrency(Currency newCurrency)
    {

        this.currency = newCurrency;

    }
}
