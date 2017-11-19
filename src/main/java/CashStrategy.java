public class CashStrategy implements PaymentStrategy {


    private double cost;
    public CashStrategy(double cost){
        setCost(cost);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    public boolean pay( double moneyHave){
        try {
            System.out.format("You paid %2.f UAH\n", cost);
            return cost <= moneyHave;
        }
        catch (Exception e){
            return false;
        }
    }
}
