package Factory;

public class ButtonFactory {
    
    public Button makeButton(String type) {
        if (type == "big") return new BigButton();
        else if (type == "small") return new SmallButton();
        else return null;
    }

}
