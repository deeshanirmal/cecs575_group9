public class Main 
{
    public static void main(String[] args) 
    {
        DeliveryPerson dPerson = new DeliveryPerson();
        ChefClass chef = new ChefClass();
        CustomerClass customer = new CustomerClass();
         
        UpdateStatus o = new UpdateStatus();
         
        o.attach(dPerson);
        o.attach(chef);
        o.attach(customer);
        
        o.notifyUpdate(new PizzaStatus("Order Confirmed"));  //the chef, customer and delivery people will recieve the status update
        o.notifyUpdate(new PizzaStatus("Order In Progress"));
        o.notifyUpdate(new PizzaStatus("Order Picked Up"));

        o.detach(chef);
        o.notifyUpdate(new PizzaStatus("Order Delivered"));
       
    }
}