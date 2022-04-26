public class DeliveryPerson implements Observer 
{
    @Override
    public void update(PizzaStatus status) {
        System.out.println("Delivery Person : Pizza Status :: " + status.getOrderStatus());
    }
}