package Builder;

public class Director {
    
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Model getModel() {
        return builder.getModel();
    }

    public void makeHighQualityModel() {
        builder.buildScreen();
        builder.buildKeyboard();
        builder.buildRam(16);
    }

    public void makeLowQualityModel() {
        builder.buildScreen();
        builder.buildKeyboard();
        builder.buildRam(4);
    }

}
