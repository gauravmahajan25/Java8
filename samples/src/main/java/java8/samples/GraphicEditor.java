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
	public void drwaingShape(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] args) {
		GraphicEditor editor = new GraphicEditor();
		
		Shape circle = () -> System.out.println("Drawing Circle using Lambda");
		editor.drwaingShape(circle);
		
		editor.drwaingShape(() -> System.out.println("Drawing Triangle using Lambda"));		
	}

}
