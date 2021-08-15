package Builder;

public class ComputerModel implements Model {

    private String screen;
    private String keyboard;
    private int ram;

    @Override
    public void setScreen(String screen) {
        this.screen = screen;
    }

    @Override
    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String getScreen() {
        return this.screen;
    }

    @Override
    public String getKeyboard() {
        return this.keyboard;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int getRam() {
        return this.ram;
    }

}
