package book_designPatterns._2_Observer.FirstRealisation;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;

    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current condition: temperature = " + temperature + ", humidity = " + humidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
