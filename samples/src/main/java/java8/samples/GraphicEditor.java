package java8.samples;

/**
 * Graphic Editor class drawing shape using java8 approach.
 * @author Vihaan
 *
 */
public class GraphicEditor {
	
	/**
	 * Method to draw shape based on the behavior passed. 
	 * @param shape
	 */
	public void drawingShape(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] args) {
		final GraphicEditor editor = new GraphicEditor();
		
		final Shape circle = () -> System.out.println("Drawing Circle using Lambda");
		editor.drawingShape(circle);
		
		editor.drawingShape(() -> System.out.println("Drawing Triangle using Lambda"));		
	}

}
