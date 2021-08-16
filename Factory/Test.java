package Factory;

public class Test {
    
    public static void main(String[] args){
		ButtonFactory buttonFactory = new ButtonFactory();
        Button bigButton = buttonFactory.makeButton("big");
        bigButton.onClick();
        Button smallButton = buttonFactory.makeButton("small");
        smallButton.onClick();
	}

}
