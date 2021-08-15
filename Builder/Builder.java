package Builder;

public interface Builder {
    
    public void buildScreen();
    public void buildKeyboard();
    public void buildRam(int ram);
    public Model getModel();

}
