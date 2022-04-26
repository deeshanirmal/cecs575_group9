public class CustomerClass implements Observer 
{
    @Override
    public void update(PizzaStatus status) {
        System.out.println("Customer : Pizza Status :: " + status.getOrderStatus());
    }
}