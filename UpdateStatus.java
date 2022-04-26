import java.util.ArrayList;
import java.util.List;
 
public class UpdateStatus implements Observable {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void attach(Observer obj) {
        observers.add(obj);
    }
 
    @Override
    public void detach(Observer obj) {
        observers.remove(obj);
    }
 
    @Override
    public void notifyUpdate(PizzaStatus status) {
        for(Observer obj: observers) {
            obj.update(status);
        }
    }
}