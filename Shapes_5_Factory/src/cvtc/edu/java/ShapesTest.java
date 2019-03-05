package cvtc.edu.java;

import cvtc.edu.java.Interfaces.Dialog;
import cvtc.edu.java.Interfaces.Shape;
import cvtc.edu.java.ShapeFactory;
import cvtc.edu.java.ShapeType;

public class ShapesTest {

	private static Dialog dialog;
	public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory(dialog);

	      // Create Shapes
	      Shape cuboid = shapeFactory.make(ShapeType.CUBOID);
	      Shape cylinder = shapeFactory.make(ShapeType.CYLINDER);
	      Shape sphere = shapeFactory.make(ShapeType.SPHERE);
	      
	      cuboid.draw();
	      cylinder.draw();
	      sphere.draw();
	   }
	
}
