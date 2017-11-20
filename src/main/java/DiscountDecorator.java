public class DiscountDecorator extends CartDecorator{
    private CartDecorator cd;


    public CartDecorator getCd() {
        return cd;
    }

    public void setCd(CartDecorator cd) {
        this.cd = cd;
    }


    public DiscountDecorator(Cart cart){
        super(cart);
    }

    @Override
    public double computeTotalPrice(){
        return cd.computeTotalPrice()* 0.95;
    }
}
