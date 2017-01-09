package oop.samples;

public class AnonymousClassRunnable {
	
	public static void main(String[] args) {
		Runnable testRunnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Runnable with Inner Class");
			}
		};
		
		Thread testThread = new Thread(testRunnable);
		testThread.start();
	}

}
