import java.util.ArrayList;
import java.util.List;

public class MessageNotifier {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void receiveNewMessage(String message) {
        System.out.println("Nuevo mensaje recibido: " + message);
        notifyObservers(message);
    }
}
