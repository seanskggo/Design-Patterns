package Composite;

public class CompositeOr implements BooleanNode {

    BooleanNode left;
    BooleanNode right;

    public CompositeOr(BooleanNode left, BooleanNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() || right.evaluate();
    }

    @Override
    public String getPretty() {
        return "(OR " + left.getPretty() + ' ' + right.getPretty() + ')';
    }

}

