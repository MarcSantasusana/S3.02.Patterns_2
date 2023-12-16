package n1Observer;

import java.util.ArrayList;
import java.util.List;

public class StockBroker {

    private float stock;
    private List<Agency> agencyList;

    public StockBroker()
    {
        this.agencyList = new ArrayList<Agency>();
    }

    public void addAgency(Agency agency)
    {
        this.agencyList.add(agency);
    }

    public void removeAgency(Agency agency)
    {
        this.agencyList.remove(agency);
    }

    public float getStock() {
        return stock;
    }

    public List<Agency> getAgencyList() {
        return agencyList;
    }

    public void setStock(float stock)
    {
        this.stock = stock;

        agencyList.forEach(agency -> agency.update(this.stock));

    }
}
