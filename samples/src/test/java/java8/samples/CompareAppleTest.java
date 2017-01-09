package java8.samples;

import static org.testng.AssertJUnit.assertEquals;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

@Test
public class CompareAppleTest {
	
	@Test
	public void testSortApple() {
		Apple apple1 = new Apple();
		apple1.setWeight(30);
		Apple apple2 = new Apple();
		apple2.setWeight(10);
		Apple apple3 = new Apple();
		apple3.setWeight(110);
		
		List<Apple> actualList = new ArrayList<>();
		actualList.add(apple1);
		actualList.add(apple2);
		actualList.add(apple3);
		
		CompareApple compareClass = new CompareApple();
		List<Apple> result = compareClass.sortApple(actualList);
		
		List<Apple> expectedList = new ArrayList<>();
		expectedList.add(apple2);
		expectedList.add(apple1);
		expectedList.add(apple3);
		
		assertEquals(expectedList, result);

	}

}
