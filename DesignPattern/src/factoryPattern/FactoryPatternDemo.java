package factoryPattern;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
		
		Shape c = sf.getShape("CIRCLE");
		c.draw();

		Shape r = sf.getShape("RECTANGLE");
		r.draw();
		
		Shape s = sf.getShape("SQUARE");
		s.draw();
	}

}
