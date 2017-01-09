package oop.samples;

/**
 * Graphic Editor class drawing shapes using OOP approach.
 * @author Gaurav
 *
 */
public class GraphicEditor {
	
	/**
	 * Drawing shape based on the type passed.
	 * @param shape
	 */
	public void drwaingShape(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		
		Circle circle = new Circle();
		editor.drwaingShape(circle);
		
		Triangle triangle = new Triangle();
		editor.drwaingShape(triangle);		
	}

}
