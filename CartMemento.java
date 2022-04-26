public class CartMemento {
  private final long id;
  private final String status;
  private final int orderValue;
   
  public CartMemento(long id, String status, int orderValue) {
    super();
    this.id = id;
    this.status = status;
    this.orderValue = orderValue;
  }
 
  public long getId() {
    return id;
  }
 
  public String getStatus() {
    return status;
  }

  public int getOrderValue() {
    return orderValue;
  }
}
