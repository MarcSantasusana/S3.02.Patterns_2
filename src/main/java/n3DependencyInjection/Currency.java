package n3DependencyInjection;

public abstract class Currency {

    public abstract void convertPrice(Article article) throws NoSuchFieldException, NoSuchMethodException;

    public abstract String returnSymbol();

}
