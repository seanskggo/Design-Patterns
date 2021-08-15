package Visitor;

import java.awt.Color;

public class ShapeColourVisitor implements ShapeVisitor {

    @Override
    public void visit(Circle c) {
        c.setColour(Color.RED);
    }

    @Override
    public void visit(Rectangle r) {
        r.setColour(Color.GREEN);
    }

    @Override
    public void visit(Triangle t) {
        t.setColour(Color.BLUE);
    }

    @Override
    public void visit(ShapeGroup s) {
        
    }

}
