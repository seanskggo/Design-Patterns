package Adapter;

public class PlugAdapter implements Plug {

    private ForeignPlug plug;

    public PlugAdapter(ForeignPlug plug) {
        this.plug = plug;
    }

    @Override
    public void plug() {
        plug.install();
    }

    @Override
    public void unplug() {
        plug.uninstall();
    }

}
