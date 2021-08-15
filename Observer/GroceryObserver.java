package Observer;

// Represents each Observer that is monitoring changes in the subject

public class GroceryObserver implements Observer {
	
	private double price;
	private Subject grocery;
	
	public GroceryObserver(Subject grocery){
		
		// Store grocery object to make method calls if necessary
		this.grocery = grocery;
		grocery.register(this);
		
	}
	
	public void update(double newPrice) {
		this.price = newPrice;
		printThePrices();
	}
	
	public void printThePrices() {
		System.out.println("Price: " + price);
	}
	
}