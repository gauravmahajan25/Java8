package java8.samples;

public class LambdaRunnableExample {
	
	public static void main(String[] args) {
		final Runnable lambdaRunnable = () -> {System.out.println("Thread with Lambda");};
		final Thread lambdaThread = new Thread(lambdaRunnable);
		lambdaThread.start();
	}
}
