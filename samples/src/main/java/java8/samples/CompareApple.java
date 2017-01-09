package java8.samples;

import java.util.ArrayList;
import java.util.List;

public class CompareApple {
	
	public static void main(String [] args) {
		final CompareApple testCompare = new CompareApple();
		testCompare.sortApple(testCompare.getApples());
		for (Apple apple : testCompare.getApples()) {
			System.out.println(apple.getWeight());
		}
	}

	public List<Apple> getApples() {
		Apple a0 = new Apple();
		a0.setWeight(10);
		Apple a1 = new Apple();
		a1.setWeight(150);
		Apple a2 = new Apple();
		a2.setWeight(100);
		
		List <Apple> appleList = new ArrayList<>();
		appleList.add(a0);
		appleList.add(a1);
		appleList.add(a2);
		
		return appleList;
	}
	
	public List <Apple> sortApple(List <Apple> appleList) {
		appleList.sort((a1, a2) -> a1.getWeight().compareTo(a2.getWeight()));
		return appleList;
	}

}
