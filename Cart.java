public class Cart 
{
  private long id;
  private String status;
  private int orderValue;

  public Cart(long id, String status) {
    super();
    this.id = id;
    this.status = status;
  }
   
  //Setters and getters
   
  public CartMemento createMemento() 
  {
    CartMemento m = new CartMemento(id, status, orderValue);
    return m;
  }

  public void setStatus(String status) {
        this.status = status;
}

  public void setOrderValue(int orderValue) {
        this.orderValue = orderValue;
}

   
  public void restore(CartMemento m) {
    this.id = m.getId();
    this.status = m.getStatus();
    this.orderValue = m.getOrderValue();
  }
 
  @Override
  public String toString() {
    return "Cart [id=" + id + ", status=" + status + ", order Value="+ orderValue+"]";
  }
  
}