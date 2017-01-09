package java8.samples;

import java.util.function.BiConsumer;

public class ExceptionHamdlingExample {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int key = 0;

		process(arr1, key, wrapperLambda((v, k) -> {
			System.out.println(v / k);
		}));
	}

	private static void process(int[] arr1, int key, BiConsumer<Integer, Integer> consumer) {
		for (int i : arr1) {
			consumer.accept(i, key);
		}

	}

	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v, k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException e) {
				System.out.println("Exception occurred!");
			}
		};

	}
}
