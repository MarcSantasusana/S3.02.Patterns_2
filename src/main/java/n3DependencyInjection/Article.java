package n3DependencyInjection;

public interface Article {

     float getPrice() throws NoSuchFieldException, NoSuchMethodException;
     Currency getCurrency();

     String getName();

     void setPrice(float price);

     void setCurrency(Currency currency);
}
