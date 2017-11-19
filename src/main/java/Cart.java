
import java.util.ArrayList;

public class Cart {

    private ArrayList<ComputerGame> games;
    private PaymentStrategy paymentStrategy;
    private DeliveryStrategy deliveryStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setDeliveryStrategy(DeliveryStrategy deliveryStrategy) {
        this.deliveryStrategy = deliveryStrategy;
    }

    public double computeTotalPrice(){
        return  100.500;
    }
    public void ship(){
        if (paymentStrategy.pay(computeTotalPrice())){
            deliveryStrategy.delivery(games);
        }
    }
}
