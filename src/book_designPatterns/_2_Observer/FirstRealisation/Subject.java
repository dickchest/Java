package book_designPatterns._2_Observer.FirstRealisation;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
