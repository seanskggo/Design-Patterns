package Observer;

public class Test{
	
	public static void main(String[] args){
		
		// Create the Subject object
		// It will handle updating all observers 
		// as well as deleting and adding them
		
		Groceries groceries = new Groceries();
		
		// Create an Observer that will be sent updates from Subject
		
		GroceryObserver observer1 = new GroceryObserver(groceries);
		
		groceries.setPrice(10.99);
		
		GroceryObserver observer2 = new GroceryObserver(groceries);
		
		groceries.setPrice(11.99);
		
	}
	
}
