// from Head First Design Patterns by Freeman and Robson

package patterns.observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void remove Observer(Observer o);
    public void notifyObservers();

}
