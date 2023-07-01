package book_designPatterns._2_Observer.secondRealisation;


import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    //Объект элемента текущего состояния добавляется в качестве наблюдателя.
    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    // Обновленный метод
    //update() получает
    //Observable и необязательные данные.

    // В update() мы сначала
    //проверяем, что субъект относится к типу
    //WeatherData, затем
    //используем его getметоды для получения
    //температуры и влажности, после чего вызываем display().
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
