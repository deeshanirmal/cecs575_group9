public class ChefClass implements Observer 
{
    @Override
    public void update(PizzaStatus status) {
        System.out.println("Chef : Pizza Status :: " + status.getOrderStatus());
    }
}