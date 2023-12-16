package n3DependencyInjection;

public class EUR extends Currency{

    private static final String SYMBOL = "€";
    private static final float GBP_TO_EUR_CONVERSION = 1.17F;
    private static final float USD_TO_EUR_CONVERSION = 0.93F;

    @Override
    public void convertPrice(Article article) throws NoSuchFieldException, NoSuchMethodException {

        float newPrice;

        if(article.getCurrency() instanceof GBP)
        {
            newPrice = article.getPrice()*GBP_TO_EUR_CONVERSION;


        }else {
            if(article.getCurrency() instanceof USD)
            {
                newPrice = article.getPrice()*USD_TO_EUR_CONVERSION;

            }
            else {
                newPrice = article.getPrice();

            }
        }

        article.setPrice(newPrice);


    }

    @Override
    public String returnSymbol() {
        return SYMBOL;
    }
}
