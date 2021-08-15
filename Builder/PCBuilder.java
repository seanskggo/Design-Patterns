package Builder;

public class PCBuilder implements Builder {

    private Model model;

    public PCBuilder(Model model) {
        this.model = model;
    }

    @Override
    public void buildScreen() {
        this.model.setScreen("PC Screen");
    }

    @Override
    public void buildKeyboard() {
        this.model.setKeyboard("PC Keyboard");
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
