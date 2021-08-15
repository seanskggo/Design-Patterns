package Visitor;

public interface ShapeVisitor {

	public void visit(Circle c);
	public void visit(Rectangle r);
	public void visit(Triangle t);
	public void visit(ShapeGroup s);

}
