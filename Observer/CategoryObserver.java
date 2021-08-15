package Observer;

// Represents each Observer that is monitoring changes in the subject

public class CategoryObserver implements Observer {
	
	private double price;
	private Subject grocery;
	
	public CategoryObserver(Subject grocery){
		
		// Store grocery object to make method calls if necessary
		this.grocery = grocery;
		grocery.register(this);
		
	}
	
	public void update(double newPrice) {
		this.price = newPrice;
		System.out.println("Updated Price: " + price);
	}
	
	public void printCategory() {
		System.out.println("Category: " + grocery.getCategoryName());
	}
	
}