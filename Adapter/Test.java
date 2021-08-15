package Adapter;

public class Test {

    public static void main(String[] args) {

        LocalPlug localPlug = new LocalPlug();
        ForeignPlug foreignPlug = new ForeignPlug();
        Plug plugAdapter = new PlugAdapter(foreignPlug);

        System.out.println("Local Plug Behaviour");
        localPlug.plug();
        localPlug.unplug();

        System.out.println("Foreign Plug Behaviour");
        foreignPlug.install();
        foreignPlug.uninstall();

        System.out.println("Local Plug Behaviour");
        plugAdapter.plug();
        plugAdapter.unplug();
        
    }

}
