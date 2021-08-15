package Composite;

public class CompositeAnd implements BooleanNode {

    BooleanNode left;
    BooleanNode right;

    public CompositeAnd(BooleanNode left, BooleanNode right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean evaluate() {
        return left.evaluate() && right.evaluate();
    }

    @Override
    public String getPretty() {
        return "(AND " + left.getPretty() + ' ' + right.getPretty() + ')';
    }

}
