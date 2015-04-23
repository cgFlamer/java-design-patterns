package clase;

public interface IEmitter {
	public void attachObserver(IObserver observer);
	public void detachObserver(IObserver observer);
	public void notifyObservers();
}
