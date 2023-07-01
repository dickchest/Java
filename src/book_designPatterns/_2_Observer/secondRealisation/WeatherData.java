package book_designPatterns._2_Observer.secondRealisation;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {
    // обьявления переменных экземпляра
    private float temperature;
    private float humidity;
    private float pressure;

    // Теперь структура для хранения
    // наблюдателей не нужна.
    public WeatherData() {
    }

    // Перед вызовом
    // notifyObservers() необходимо
    // вызвать setChanged().

    // Объект данных не передается —
    //это означает, что мы используем
    //модель ЗАПРОСА ДАННЫХ.
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    //Эти методы будут использоваться наблюдателями для
    //получения состояния объекта
    //WeatherData.


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
