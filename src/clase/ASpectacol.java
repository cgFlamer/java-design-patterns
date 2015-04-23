package clase;

import java.util.ArrayList;

public class ASpectacol implements IEmitter {

	protected ArrayList<IObserver> observers;
	
	protected String name;
	
	public ASpectacol(String nume) {
		super();
		name = nume;
		observers = new ArrayList<IObserver>();
	}
	
	@Override
	public void attachObserver(IObserver observer) {
		observers.add(observer);
	}

	@Override
	public void detachObserver(IObserver observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		System.out.println("---");
		System.out.println("Spectacolul " + name + " va incepe curand...");
		for(IObserver observer : observers) {
			observer.update();
		}
		System.out.println("---");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
