package n3DependencyInjection;

public class GBP extends Currency{
    private static final String SYMBOL = "£";

    private static final float EUR_TO_GBP_CONVERSION = 0.86F;
    private static final float USD_TP_GBP_CONVERSION = 0.8F;

    @Override
    public void convertPrice(Article article) throws NoSuchFieldException, NoSuchMethodException {

        float newPrice;

        if(article.getCurrency() instanceof EUR)
        {
            newPrice = article.getPrice()*EUR_TO_GBP_CONVERSION;


        }else {
            if(article.getCurrency() instanceof USD)
            {
                newPrice = article.getPrice()*USD_TP_GBP_CONVERSION;

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
