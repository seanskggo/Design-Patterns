package Composite;

public class CompositeNot implements BooleanNode {

    BooleanNode middle;

    public CompositeNot(BooleanNode middle) {
        this.middle = middle;
    }

    @Override
    public boolean evaluate() {
        return !middle.evaluate();
    }

    @Override
    public String getPretty() {
        return "(NOT " + middle.getPretty() + ')';
    }

}
