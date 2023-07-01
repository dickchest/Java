package book_designPatterns._2_Observer.firstRealisation;

import java.util.ArrayList;

public class WeatherData implements Subject {
    // обьявления переменных экземпляра
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

//    public void measurementsChanged() {
//        float temp = getTemperature();
//        float humidity = getHumidity();
//        float pressure = getPressure();
//        currentConditionDispaly.update(temp, humidity, pressure);
//        statisticsDispaly.update(temp, humidity, pressure);
//        forecastDispaly.update(temp, humidity, pressure);
//    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    // тестовый метод
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
