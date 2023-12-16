package n3DependencyInjection;

public class USD extends Currency {
    private static final String SYMBOL = "$";

    private static final float EUR_TO_USD_CONVERSION = 1.08F;
    private static final float GBP_TO_USD_CONVERSION = 1.26F;

    @Override
    public void convertPrice(Article article) throws NoSuchFieldException, NoSuchMethodException {

        float newPrice;

        if (article.getCurrency() instanceof EUR) {
            newPrice = article.getPrice() * EUR_TO_USD_CONVERSION;


        } else {
            if (article.getCurrency() instanceof GBP) {
                newPrice = article.getPrice() * GBP_TO_USD_CONVERSION;

            } else {
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