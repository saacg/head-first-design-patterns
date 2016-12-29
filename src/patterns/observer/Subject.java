// from Head First Design Patterns by Freeman and Robson

package patterns.observer;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
