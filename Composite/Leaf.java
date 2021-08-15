package Composite;

public class Leaf implements BooleanNode {
    
    boolean value;

    public Leaf(boolean value) {
        this.value = value;
    }

    @Override
    public String getPretty() {
        return Boolean.toString(value);
    }

    @Override
    public boolean evaluate() {
        return value;
    }

}
