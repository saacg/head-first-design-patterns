// from Head First Design Patterns by Freeman and Robson

package patterns.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {

        observers = new ArrayList<Observer>();

    }

    public void registerObserver(Observer o) {

        observers.add(o); 

    }

    public void removeObserver(Observer o) {

        int i = observers.indexOf(o);

        if ( i >= 0) {
            observers.remove(i);
        }

    }

    public void notifyObservers() {

        for(Observer observer : observers) {
            observer.update();
        }

    }

    public void measurementsChanged() {
        
        notifyObservers();

    }

    public void setMeasurements(float temperature, float humidity, float pressure) {

        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();

    }

    public float getTemperature() {

        return this.temperature;

    }

    public float getHumidity() {

        return this.humidity;

    }
    
    public float getPressure() {

        return this.pressure;

    }

}
