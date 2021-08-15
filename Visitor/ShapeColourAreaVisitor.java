package Visitor;

import java.awt.Color;

public class ShapeColourAreaVisitor implements ShapeVisitor {

    private Color colour;
    private double area;

    public ShapeColourAreaVisitor(Color colour) {
        this.colour = colour;
        this.area = 0;
    }

    public double getTotalArea() {
        return area;
    }

    @Override
    public void visit(Circle c) {
        if (c.getColour().equals(colour)) area += c.area();
    }

    @Override
    public void visit(Rectangle r) {
        if (r.getColour().equals(colour)) area += r.area();
    }

    @Override
    public void visit(Triangle t) {
        if (t.getColour().equals(colour)) area += t.area();
    }

    @Override
    public void visit(ShapeGroup s) {

    }

}
