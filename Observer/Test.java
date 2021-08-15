package Observer;

public class Test{
	
	public static void main(String[] args){
		Groceries groceries = new Groceries();
		CategoryObserver groceryObserver = new CategoryObserver(groceries);
		groceries.setPrice(10.99);
		groceries.setPrice(11.99);
		groceryObserver.printCategory();
	}
	
}
