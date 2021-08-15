package Observer;

import java.util.ArrayList;

// Individual grocery prices as list of subjects

public class Groceries implements Subject {
	
	private ArrayList<Observer> observers;
	private double price;
	private String categoryName;
	
	public Groceries() {		
		observers = new ArrayList<Observer>();
		categoryName = "Groceries";	// can have other category groups/classes such as kitchenware and clothes
	}
	
	public void register(Observer newObserver) {
		observers.add(newObserver);
	}

	public void unregister(Observer deleteObserver) {
		observers.remove(deleteObserver);
	}

	public void notifyObserver() {		
		for(Observer observer : observers){
			observer.update(price);
		}
	}
	
	public void setPrice(double newPrice){
		this.price = newPrice;
		notifyObserver();
	}

	@Override
	public String getCategoryName() {
		return categoryName;
	}
	
}
