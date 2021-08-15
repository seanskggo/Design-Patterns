package Builder;

public class LaptopBuilder implements Builder {

    private Model model;

    public LaptopBuilder(Model model) {
        this.model = model;
    }

    @Override
    public void buildScreen() {
        this.model.setScreen("Laptop Screen");
    }

    @Override
    public void buildKeyboard() {
        this.model.setKeyboard("Laptop Keyboard");
    }

    @Override
    public Model getModel() {
        return this.model;
    }

    @Override
    public void buildRam(int ram) {
        this.model.setRam(ram);
    }
    
}
