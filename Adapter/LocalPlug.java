package Adapter;

public class LocalPlug implements Plug {

    @Override
    public void plug() {
        System.out.println("Plugged in!");
    }

    @Override
    public void unplug() {
        System.out.println("Unplugged!");
    }
    
}
