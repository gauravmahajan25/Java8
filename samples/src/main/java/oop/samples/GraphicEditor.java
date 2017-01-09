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
	public void drawingShape(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] args) {
		final GraphicEditor editor = new GraphicEditor();
		
		final Circle circle = new Circle();
		editor.drawingShape(circle);
		
		final Triangle triangle = new Triangle();
		editor.drawingShape(triangle);		
	}

}
