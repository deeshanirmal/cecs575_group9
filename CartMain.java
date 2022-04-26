public class CartMain {
  public static void main(String[] args) 
  {
    Cart cart1 = new Cart(1, "Empty");
    cart1.setOrderValue(0);
    System.out.println(cart1);
     
    CartMemento memento = cart1.createMemento(); //created immutable memento
     
    cart1.setStatus("Order is present");
    cart1.setOrderValue(1);    //changed content
    System.out.println(cart1);
     
    cart1.restore(memento);   //UNDO change
    System.out.println(cart1);  //original content
  }
}